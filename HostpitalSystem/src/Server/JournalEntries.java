package Server;

public class JournalEntries {
	private String text;
	
	public JournalEntries(String text){
		this.text = text;
	}
	
	public void update(String newText){
		text = newText;
	}
	public String getText(){
		return text;
	}
}
