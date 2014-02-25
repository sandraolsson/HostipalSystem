package Server;

public class ServerParser {
	PatientList list;

	public ServerParser(PatientList list) {
		this.list = list;
	}

	
	public String parse(String in) {
		String input[] = in.split(":");

		if (input.length == 0) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		switch (input[0]) {
		
		case "get":
			PatientSender ps = list.getPatient(input[1]);
			Patient pat = ps.getPatient();
			sb.append(pat.getPnbr() + ":");
			sb.append(pat.getName() + ":");
			sb.append(pat.getJournal().getText() + ":");
			if (ps.canRead()) {
				sb.append("Y:");
			} else {
				sb.append("N:");
			}
			if (ps.canEdit()) {
				sb.append("Y:");
			} else {
				sb.append("N:");
			}
			if (ps.canDelete()) {
				sb.append("Y:");
			} else {
				sb.append("N:");
			}
			break;

		case "del":
			list.deletePatient(input[1]);
			break;
			
		case "add":
			Patient p = new Patient(input[1],input[2],input[3]);
			list.addPatient(p);
			break;
		case "njr":
			PatientSender psender = list.getPatient(input[1]);
			Patient pa = psender.getPatient();
			pa.addJournal(input[2], CurrentUser.instance().getPnbr(), input[3]);
			break;
			
		}
		
		String toSend = sb.toString();
		if(!toSend.isEmpty()){
			return toSend;
		}
		else{
			return null;
		}
		
	}
}
