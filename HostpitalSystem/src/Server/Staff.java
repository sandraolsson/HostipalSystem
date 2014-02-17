package Server;

public class Staff {
	private String pNbr, name;
	private String division;
	private int level;
// Is level needed????
	
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
