package Server;

import java.util.ArrayList;
import java.util.HashSet;

public class PatientBackup {
	private String pNbr, name, division;
	private ArrayList<JournalEntries> journal;
	private HashSet<String> staff;
	
	public PatientBackup(String pnbr, String name, String division){
		this.pNbr = pnbr;
		this.name = name;
		this.division = division;
		journal = new ArrayList<JournalEntries>();
		staff = new HashSet<String>();
	}
	public void addJournal(String text, String docPnbr, String nursePnbr){
		journal.add(new JournalEntries(text));
		staff.add(docPnbr);
		staff.add(nursePnbr);
	}
	public String getPnbr(){
		return pNbr;
	}
	public String getName(){
		return name;
	}
	public String getDivision(){
		return division;
	}
	public boolean isTreatedBy(String pNbr){
		return staff.contains(pNbr);
	}
	public void updateJournal(int index, String newtext){
		journal.get(index).update(newtext);
	}
}
