package Server;

import java.util.HashMap;

public class PatientList implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HashMap<String, Patient> allPatient;
	Logger log;

	public PatientList() {
		allPatient = new HashMap<String, Patient>();
		log = new Logger();
	}

	public void addPatient(Patient p) {
		if (CurrentUser.instance().getLevel() == 2) {
			allPatient.put(p.getPnbr(), p);
			log.log("Added patient: " + p.getPnbr());
		}
		else {
			log.log("Failed to add patient: " + p.getPnbr());
		}
	}

	public PatientSender getPatient(String patientPnbr) {
		PatientSender sender;
		Patient p = allPatient.get(patientPnbr);
		boolean read, delete, edit;
		read = delete = edit = false;
		if (p == null)
			return null;
		if (p.isTreatedBy(CurrentUser.instance().getPnbr()))
			edit = read = true;
		else if (CurrentUser.instance().getDivision().equals(p.getDivision())
				|| CurrentUser.instance().getPnbr() == p.getPnbr()) {
			read = true;
		}
		delete = (CurrentUser.instance().getLevel() == 1);

		sender = new PatientSender(p, read, edit, delete);
		log.log("Accesed patient: " + p.getPnbr());
		return sender;
	}

	public void deletePatient(String pNbr) {
		if (CurrentUser.instance().getLevel() == 1){
			allPatient.remove(pNbr);
		log.log("Deleted patient: " + pNbr);
		}
		else{
			log.log("Failed to delete patient: " +pNbr);
		}
	}

	public boolean update(Patient p) {
		if (p.isTreatedBy(CurrentUser.instance().getPnbr())) {
			allPatient.put(p.getPnbr(), p);
			log.log("Updated patient: " + p.getPnbr());
			return true;
		}
		return false;
	}

	public void newJournal(String patientPnbr, String text, String docPnbr,
			String nursePnbr) {
		Patient p = allPatient.get(patientPnbr);
		if (p.isTreatedBy(CurrentUser.instance().getPnbr())) {
			p.addJournal(text, docPnbr, nursePnbr);
			log.log("Added a new journal to patient: " + patientPnbr);
		}
	}
}