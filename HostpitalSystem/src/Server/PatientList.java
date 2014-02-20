package Server;

import java.util.HashMap;

public class PatientList {
	HashMap<String, Patient> allPatient;

	public PatientList() {
		allPatient = new HashMap<String, Patient>();
	}

	public void addPatient(Patient p) {
		if (CurrentUser.instance().getLevel() == 2) {
			allPatient.put(p.getPnbr(), p);
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
		return sender;
	}

	public void deletePatient(String pNbr) {
		if (CurrentUser.instance().getLevel() == 1)
			allPatient.remove(pNbr);
	}
	public boolean update(Patient p){
		if(p.isTreatedBy(CurrentUser.instance().getPnbr())){
			allPatient.put(p.getPnbr(), p);
			return true;
		}
		return false;
	}

	// TODO Write a update-method, if you want to update/edit a journal. This
	// has to be implemented in some way.

}
