package Server;

public class Journal implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String text;

	public Journal() {
	}

	public void update(String newText) {
		if (text == null || text.isEmpty()) {
			text = newText;
		} else {
			text = text + newText;
		}
	}

	public String getText() {
		return text;
	}
}
