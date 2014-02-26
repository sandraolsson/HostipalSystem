package Server;

import java.io.*;
import java.net.*;
import java.security.KeyStore;

import javax.net.*;
import javax.net.ssl.*;
import javax.security.cert.X509Certificate;
import javax.swing.JFileChooser;

public class Connection implements Runnable {
	private ServerSocket serverSocket = null;
	private static int numConnectedClients = 0;

	public Connection(ServerSocket ss) throws IOException {
		serverSocket = ss;
		newListener();
	}

	public void run() {
		try {
			// Here should the user choose a file with JFilechooser of the
			// PatientList;
			
//			System.out.println("Now we want you to choose you saved PatientList");
//			PatientList plist = null;
//			JFileChooser pfc = new JFileChooser();
//			pfc.setDialogTitle("Choose your saved PatientList");
//			int returnVal2 = pfc.showOpenDialog(null);
//			File Patlist = pfc.getSelectedFile();
//			String patPath = Patlist.getAbsolutePath();
//			
			PatientList plist = new PatientList();
//		      try
//		      {
//		         FileInputStream fileIn = new FileInputStream(patPath);
//		         ObjectInputStream in = new ObjectInputStream(fileIn);
//		         plist = (PatientList) in.readObject();
//		         in.close();
//		         fileIn.close();
//		      }catch(IOException i)
//		      {
//		         i.printStackTrace();
//		         return;
//		      }catch(ClassNotFoundException c)
//		      {
//		         System.out.println("Employee class not found");
//		         c.printStackTrace();
//		         return;
//		      }
			
			
			

			SSLSocket socket = (SSLSocket) serverSocket.accept();
			newListener();
			SSLSession session = socket.getSession();
			X509Certificate cert = (X509Certificate) session
					.getPeerCertificateChain()[0];
			String subject = cert.getSubjectDN().getName();
			numConnectedClients++;
			System.out.println("client connected");
			System.out.println("client name (cert subject DN field): "
					+ subject);
			System.out.println(numConnectedClients
					+ " concurrent connection(s)\n");
			
			
			String userinfo[] = subject.split(":");
			String pnbr = userinfo[0];
			String div = userinfo[1];
			int level = Integer.parseInt(userinfo[2]);
			CurrentUser.instance().loginAs(pnbr, level, div);
			System.out.println("Client Pnbr : " + pnbr);
			System.out.println("Client Division : " + div);
			System.out.println("Client Level : " + ((Integer)level).toString());
			
			PrintWriter out = null;
			BufferedReader in = null;
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			ServerParser serverParser = new ServerParser(plist);

			String clientMsg = null;
			while ((clientMsg = in.readLine()) != null) {
				String toSend = serverParser.parse(clientMsg);

				out.println(toSend);
				out.flush();
				System.out.println("done\n");
			}
			in.close();
			out.close();
			socket.close();
			numConnectedClients--;
			System.out.println("client disconnected");
			System.out.println(numConnectedClients
					+ " concurrent connection(s)\n");
		} catch (IOException e) {
			System.out.println("Client died: " + e.getMessage());
			e.printStackTrace();
			return;
		}
	}

	private void newListener() {
		(new Thread(this)).start();
	} // calls run()

	public static void main(String args[]) {

		System.out.println("\nServer Started\n");
		// int port = -1;
		int port = 5001;
		if (args.length >= 1) {
			port = Integer.parseInt(args[0]);
		}
		String type = "TLS";
		try {
			ServerSocketFactory ssf = getServerSocketFactory(type);
			ServerSocket ss = ssf.createServerSocket(port);
			((SSLServerSocket) ss).setNeedClientAuth(true); // enables client
															// authentication
			new Connection(ss);
		} catch (IOException e) {
			System.out.println("Unable to start Server: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static ServerSocketFactory getServerSocketFactory(String type) {
		if (type.equals("TLS")) {
			SSLServerSocketFactory ssf = null;
			try { // set up key manager to perform server authentication
				SSLContext ctx = SSLContext.getInstance("TLS");
				KeyManagerFactory kmf = KeyManagerFactory
						.getInstance("SunX509");
				TrustManagerFactory tmf = TrustManagerFactory
						.getInstance("SunX509");
				KeyStore ks = KeyStore.getInstance("JKS");
				KeyStore ts = KeyStore.getInstance("JKS");
				char[] password = "password".toCharArray();

				JFileChooser fc = new JFileChooser();
				fc.setDialogTitle("Choose Keystore to use");
				int returnVal = fc.showOpenDialog(null);
				if(returnVal != JFileChooser.APPROVE_OPTION){
					System.exit(0);
				}
				File keystore = fc.getSelectedFile();
				String path = keystore.getAbsolutePath();
				String path2 = path.replaceFirst("keystore", "truststore");
				System.out.println("Choosen path for KeyStore = " + path);
				System.out.println("Choosen path for TrustStore = " + path2);
				ks.load(new FileInputStream(path), password); // keystore
																// password
																// (storepass)

//				JFileChooser fc2 = new JFileChooser();
//				fc2.setDialogTitle("Choose Truststore to use");
//				int returnVal2 = fc2.showOpenDialog(null);
//				File truststore = fc2.getSelectedFile();
//				String path2 = truststore.getAbsolutePath();
//				System.out.println("Choosen path for truststore = " + path);
				ts.load(new FileInputStream(path2), password); // truststore
																// password
																// (storepass)
				kmf.init(ks, password); // certificate password (keypass)
				tmf.init(ts); // possible to use keystore as truststore here
				ctx.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
				ssf = ctx.getServerSocketFactory();
				return ssf;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return ServerSocketFactory.getDefault();
		}
		return null;
	}

}