
public class WordObject {
	private String word;
	private int occurrence;
	
	
	public WordObject(String word) {
		this.word = word;
		this.occurrence = 0;
	}
	
	
	public String getWord() {
		return this.word;
	}
	
	public int getOccurrence() {
		return this.occurrence;
	}
	
	public void setOccurrence() {
		occurrence++;
		
	}

}
