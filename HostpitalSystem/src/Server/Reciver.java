package Server;

public class Reciver {
	PatientList pl;
	
	public Reciver(PatientList pl){
		this.pl = pl;
	}
	
	public PatientSender execute(PatientSender PSin){
		PatientSender ps = PSin;
		String order = ps.getOrder();
		String parameter = ps.getParameter();
		
		switch(order){
		case "get":
			PatientSender tosend = pl.getPatient(parameter);
			// Send over SSL
			break;
			
		case "add":
			pl.addPatient(ps.getPatient());
			// Maybe return someting.
			break;
		}
		return null;
	}
	

}
