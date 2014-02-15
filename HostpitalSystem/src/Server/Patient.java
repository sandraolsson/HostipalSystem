package Server;

import java.util.ArrayList;
import java.util.HashSet;

public class Patient {
	private String pNbr, name;
	private ArrayList<JournalEntries> journal;
	private HashSet<String> staff;
	
	public Patient(String pnbr, String name){
		this.pNbr = pnbr;
		this.name = name;
		journal = new ArrayList<JournalEntries>();
		staff = new HashSet<String>();
	}
}
