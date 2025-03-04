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
			fw = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void log(String toWrite) {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(new Timestamp(System.currentTimeMillis())
					+ System.getProperty("line.separator"));
			sb.append("User:" + CurrentUser.instance().getPnbr()
					+ System.getProperty("line.separator"));
			sb.append("Preformed the action: " + toWrite
					+ System.getProperty("line.separator"));
			fw.write(sb.toString());
			fw.flush();

			System.out.println("Logging Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
