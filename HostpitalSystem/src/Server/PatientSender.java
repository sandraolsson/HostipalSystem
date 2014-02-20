package Server;

public class PatientSender {
	String order;
	String parameter;
	private Patient patient;
	boolean read;
	boolean edit;
	boolean delete;
	
	public PatientSender(String order, String parameter, Patient p){
		this.order = order;
		this.parameter = parameter;
		this.patient = p;
	}
	
	public PatientSender(Patient in, boolean read, boolean edit, boolean delete){
		patient = in;
		this.read = read;
		this.edit = edit;
		this.delete = delete;
	}
	
	public Patient getPatient(){
		return patient;
	}
	public boolean canRead(){
		return read;
	}
	public boolean canEdit(){
		return edit;
	}
	public boolean canDelete(){
		return delete;
	}
	public String getOrder(){
		return order;
	}
	public String getParameter(){
		return parameter;
	}
}
