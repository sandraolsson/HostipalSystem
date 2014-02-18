package Server;

public class Staff {
	private String pNbr, name;
	private String division;
	private int level;

/*
 * LVL 1 = GOV
 * LVL 2 = DOC
 * LVL 3 = NURSE
 * LVL 4 = PATIENT
 * 
 */
	
	public Staff(String name, String pNbr, int divison, int level){
		this.name = name;
		this.pNbr = pNbr;
		this.division = division;
		this.level = level;
		
	}
	
	public int getLevel(){	
		return level;
	}
	public String getPnbr(){
		return pNbr;
	}
	public String getDivision(){
		return division;
	}
	public String getName(){
		return name;
	}
} 

/* detta ar helt fel*/
