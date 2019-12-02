import java.util.ArrayList;

//clasa care creaza obiectele care contin cuvintele din text
public class Helper {
	private String word;
	private int frequency;
	
	
	public Helper(String word, int frequency) {
		this.word = word;
		this.frequency = frequency;
	}
	
	
	public String getWord() {
		return this.word;
	}
	
	public int getFrequency() {
		return this.frequency;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public void setFrequency() {
		this.frequency++;
	}




	
}
