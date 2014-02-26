package Server;

import java.io.*;

import com.sun.jmx.snmp.Timestamp;

public class Logger {
	File file;
	FileWriter fw;
	BufferedWriter bw;

	public Logger() {
		try {
			file = new File("C:/Users/Johan/Downloads/log.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void log(String toWrite) {
		try {

			// if file doesnt exists, we create it
//			if (!file.exists()) {
//				file.createNewFile();
//			}

			StringBuilder sb = new StringBuilder();
			java.util.Date date= new java.util.Date();
			sb.append(new Timestamp(date.getTime()) + "/n");
			sb.append(CurrentUser.instance().getPnbr() + "/n");
			sb.append(toWrite);
			bw.write(sb.toString());
			bw.close();

			System.out.println("Logging Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
