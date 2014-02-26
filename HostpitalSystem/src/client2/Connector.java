package client2;


import java.net.*;
import java.io.*;
import javax.net.ssl.*;
import javax.security.cert.X509Certificate;
import java.security.KeyStore;
import java.security.cert.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.swing.*;

import java.io.*;
import java.net.*;
import java.security.KeyStore;

import javax.net.*;
import javax.net.ssl.*;
import javax.security.cert.X509Certificate;
import javax.swing.JFileChooser;





/*
 * This example shows how to set up a key manager to perform client
 * authentication.
 *
 * This program assumes that the client is not inside a firewall.
 * The application can be modified to connect to a server outside
 * the firewall by following SSLSocketClientWithTunneling.java.
 */
public class Connector {

	

	public static String UN;
	public static String DV;
	public static String Name;
	public static String PN;
	public static String PW;
	public static Boolean UserAndPasswordCorrect;
	public static Integer level;
	public static String Entry;
	public static String nurse;
	
    public static void main(String[] args) throws Exception {
		
    		
    	

    		
    	
    	
        String host = null;
        int port = -1;
        //int port = 5000;
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
        if (args.length < 2) {
            System.out.println("USAGE: java client host port");
            System.exit(-1);
        }
        try { /* get input parameters */
            host = args[0];
            port = Integer.parseInt(args[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("USAGE: java client host port");
            System.exit(-1);
        }

        try { /* set up a key manager for client authentication */
            SSLSocketFactory factory = null;
            try {
            	
            	Scanner scan = new Scanner(System.in);	

        		JOptionPane.showMessageDialog(null, "Press OK for Login"); 
        		
        	//PN = JOptionPane.showInputDialog( "Personalnumber");
        		
        		JFileChooser fc = new JFileChooser();
        		File F = new File("/Users");
        		File NameDir, NamePath;
        		int Checker;
        		fc.setCurrentDirectory(F);
        		Checker= fc.showOpenDialog(null);
        		fc.setDialogTitle("Choose Truststore to use");
        		if(Checker == JFileChooser.APPROVE_OPTION){
        			NameDir = fc.getCurrentDirectory();
        			NamePath = fc.getSelectedFile();
        			
        			PW = JOptionPane.showInputDialog( "Password");
        			String Path2 = NamePath.getAbsolutePath();
        			System.out.println(Path2);
        			String Path3 = Path2.replaceFirst("truststore", "keystore");
        			System.out.println(Path3);
        			
        	
        		
    
            	
            	
            	
                char[] password = PW.toCharArray();
                KeyStore ks = KeyStore.getInstance("JKS");
                KeyStore ts = KeyStore.getInstance("JKS");
                KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
                TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
                SSLContext ctx = SSLContext.getInstance("TLS");
                ks.load(new FileInputStream(Path3), password);  // keystore password (storepass)
				ts.load(new FileInputStream(Path2), password); // truststore password (storepass);
				kmf.init(ks, password); // user password (keypass)
				tmf.init(ts); // keystore can be used as truststore here
				ctx.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
                factory = ctx.getSocketFactory();
        		}else {
        			JOptionPane.showMessageDialog(null, "You have cancel the login", "Exit", JOptionPane.WARNING_MESSAGE); 
        			System.exit(0);
        		}
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
            SSLSocket socket = (SSLSocket)factory.createSocket(host, port);
            System.out.println("\nsocket before handshake:\n" + socket + "\n");

            /*
             * send http request
             *
             * See SSLSocketClient.java for more information about why
             * there is a forced handshake here when using PrintWriters.
             */
            socket.startHandshake();

            SSLSession session = socket.getSession();
            X509Certificate cert = (X509Certificate)session.getPeerCertificateChain()[0];
            String subject = cert.getSubjectDN().getName();
            System.out.println("certificate name (subject DN field) on certificate received from server:\n" + subject + "\n");
            System.out.println("socket after handshake:\n" + socket + "\n");
            System.out.println("secure connection established\n\n");

            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
			for (;;) {
                System.out.print(">");
                msg = read.readLine();
                if (msg.equalsIgnoreCase("quit")) {
				    break;
				}
                System.out.print("sending '" + msg + "' to server...");
                out.println(msg);
                out.flush();
                System.out.println("done");

                System.out.println("received '" + in.readLine() + "' from server\n");
            }
            in.close();
			out.close();
			read.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserAndPasswordCorrect= true;

		if( UserAndPasswordCorrect){

//		 level = Staff.getLevel(PN);
		level = 2;
		
			if (level==1 /*GOV*/){
				int knapp=1;
			
				while(knapp == 1){
					PN = JOptionPane.showInputDialog( "What patient do you want to delete? Personalnumber");
					String toSend = "del:"+PN;
					
					if( PN != null){
					knapp = JOptionPane.showConfirmDialog(null,"You have now succesfully deleted the patient", "Succesfully", JOptionPane.OK_CANCEL_OPTION);
						if(knapp == 1 || knapp == 0) {
					UIManager.put("OptionPane.yesButtonText", "Delete new patient");
					UIManager.put("OptionPane.noButtonText", "Sign out");
					knapp = JOptionPane.showConfirmDialog(null,  "Do you want to deleted a new patient or do you want to sign out "
							,"", JOptionPane.YES_NO_OPTION);
					}
					if( knapp == 1){
					  
					}

						}		
				
				//int knapp = JOptionPane.showConfirmDialog(null,"Welcome");
		
				
				//PN = JOptionPane.showInputDialog( "You have now succesfully deleted the patient \n \n What patient do you want to delete? Personalnumber");
				JOptionPane.showMessageDialog(null, "You have cancel the login", "Exit", JOptionPane.WARNING_MESSAGE); 
				System.exit(0);
			
		
					}
			
				
			}else if (level==2)/*DOC*/{
				int knapp = 1;
				int knapp2 = 1;
				while ( knapp == 1 || knapp == 0){
					
				
				UIManager.put("OptionPane.yesButtonText", "Create/add Patient");
				UIManager.put("OptionPane.noButtonText", "Show Patient");
				UIManager.put("OptionPane.cancelButtonText", "Sign out");

				knapp = JOptionPane.showConfirmDialog(null,"Welcome! ");
				
				if(knapp == 0){ // Create patient
					
					UIManager.put("OptionPane.yesButtonText", "create new Patient");
					UIManager.put("OptionPane.noButtonText", "Add Entry");
					knapp2 = JOptionPane.showConfirmDialog(null,"Nice: ");
					if (knapp2 == 0){
						Name = JOptionPane.showInputDialog( "Name of patient");	
						PN = JOptionPane.showInputDialog( "Personal number");	
						DV = JOptionPane.showInputDialog( "Devision");	
						String toSend ="add:" + PN +":"+ Name +":"+ DV;
						
						JOptionPane.showMessageDialog(null,"You patient has been added ");
					}else if(knapp2 == 1){ // Add entry
					
						PN = JOptionPane.showInputDialog( "Searh for a patient by Personalnumber");	
						
						Entry = JOptionPane.showInputDialog( "Write Entry ");	
						Entry = "Entry"+"\n"+Name;
						nurse = JOptionPane.showInputDialog( "Add Nurse, Pesonal number:");
						String toSend ="njr:" +PN+ ":Entry:"+nurse;
						JOptionPane.showMessageDialog(null,"Your Entry has been updated"  /*String Entry from server */ );
						
					}
					
				}else if(knapp == 1){ // Show Patient 
					String toGet = "get:"+PN;
					JOptionPane.showMessageDialog(null, "Journalen kommer here \n" + toGet);
				}
				
				}
			}else if (level==3 /*NURSE*/){
				PN = JOptionPane.showInputDialog( "Searh for a patient by Personalnumber");
		if (true){
		
				//	if(PN.patient.isThreatedBy(CurrentUser.getPnbr())){
				//JOptionPane.showConfirmDialog(null,JournalEntries.getText() + "Press Yes to add entries");
		
			UIManager.put("OptionPane.noButtonText", "Add Entry to Patient");
			UIManager.put("OptionPane.yesButtonText", "Search for new Patient");
			UIManager.put("OptionPane.cancelButtonText", "Sign out");
		int knapp = JOptionPane.showConfirmDialog(null,/*String Entry from server */ "\t Entries \n \n Broke his leg. \n Doctor JAmes fixed it all. \n \n Fell down from a balcony, brok his nose.\n Doctor James fixed it again. \n \n Got hit by a car. Almost dead. \n Doctor Svensson is working his as of to fix it ");
			
		if (knapp == 1){//Add entry
			Entry = JOptionPane.showInputDialog( "Write Entry ");	
			Entry = "Entry"+"\n"+Name;
			nurse = JOptionPane.showInputDialog( "Nurse:");
			String toSend ="njr:" + PN+ ":Entry";
			knapp = JOptionPane.showConfirmDialog(null,"Your Entry has been updated"  /*String Entry from server */ );
			
		}
			} 
		
		
			}else/*PATIENT*/{
		String toGet ="get:" + PN;
				JOptionPane.showMessageDialog(null, "Journalen kommer here" /*JournalEntries.getText()*/);
			}
		
		}else{
		 JOptionPane.showMessageDialog(null, "User dosent exist. Try to login again"); 
		PN = JOptionPane.showInputDialog( "Personalnumber");
		PW = JOptionPane.showInputDialog( "Password");

		
	 }
    }
}