package Server;

import java.util.ArrayList;
import java.util.HashMap;

public class PatientList {
	HashMap<String, Patient> allPatient;

	public PatientList() {
		allPatient = new HashMap<String, Patient>();
	}

	public void addPatient(Patient p) {
		allPatient.put(p.getPnbr(), p);
	}

	public Patient getPatient(String patientPnbr) {
		Patient p = allPatient.get(patientPnbr);
		if (p == null)
			return p;
		if (p.isTreatedBy(CurrentUser.instance().getCurrentUserId()))
			return p;
		else {
			return null;
		}
	}

}
