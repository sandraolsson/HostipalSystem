package Server;

import java.util.ArrayList;
import java.util.HashMap;

public class PatientList {
	HashMap<String,Patient> allPatient;
	
	public PatientList(){
		allPatient = new HashMap<String, Patient>();
	}
	
	public void addPatient(Patient p){
		allPatient.put(p.getPnbr(), p);
	}
	
	public Patient getPatient(String patientPnbr){
		Patient p = allPatient.get(patientPnbr);
		if(p == null) return p;
		// Here you must put in the doctors Pnbr in the isTreatedBy-sats.
		if( p.isTreatedBy(pnbr) ) return p;
		}
	
}
