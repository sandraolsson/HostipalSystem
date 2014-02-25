package Server;

public class PatientSender {
	private Patient patient;
	boolean read;
	boolean edit;
	boolean delete;

	public PatientSender(Patient in, boolean read, boolean edit, boolean delete) {
		patient = in;
		this.read = read;
		this.edit = edit;
		this.delete = delete;
	}

	public Patient getPatient() {
		return patient;
	}

	public boolean canRead() {
		return read;
	}

	public boolean canEdit() {
		return edit;
	}

	public boolean canDelete() {
		return delete;
	}

	public String getOrder() {
		return order;
	}

	public String getParameter() {
		return parameter;
	}
}
