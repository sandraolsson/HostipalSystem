package Server;

import java.util.HashMap;

public class PatientList {
	HashMap<String, Patient> allPatient;

	public PatientList() {
		allPatient = new HashMap<String, Patient>();
	}

	public void addPatient(Patient p) {
		allPatient.put(p.getPnbr(), p);
	}

	public PatientSender getPatient(String patientPnbr) {
		PatientSender sender;
		Patient p = allPatient.get(patientPnbr);
		boolean read, delete, edit = false;
		if (p == null)
			return null;
		if (p.
				isTreatedBy(CurrentUser.instance().getCurrentUserId()))
			edit = read = true;
		else {
			read = CurrentUser.instance().getDivision().equals(p.getDivision());
		}
		delete = (CurrentUser.instance().getCurrentUserId()
				.equals("1111111111"));

		sender = new PatientSender(p, read, edit, delete);
		return sender;
	}

	public void deletePatient(String pNbr) {
		allPatient.remove(pNbr);
	}
	
	//TODO Write a update-method, if you want to update/edit a journal. This has to be implemented in some way.

}
