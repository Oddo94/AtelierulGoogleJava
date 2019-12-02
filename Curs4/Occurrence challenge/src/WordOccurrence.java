import java.util.*;
import java.io.*;

public class WordOccurrence {
	
	public static void main(String[] args) {
		File myFile = new File("sampleText.txt");
		
		
		
		int count = 0;

	
		WordObject word1 = new WordObject("professor");
		WordObject word2 = new WordObject("free");
		WordObject word3 = new WordObject("this");
		WordObject word4 = new WordObject("are");
		WordObject word5 = new WordObject("the");
		
		WordObject[] wordArray = {word1,word2,word3,word4,word5};
		
		try {
			Scanner sc = new Scanner(myFile);
			sc.useDelimiter(" ");
			while(sc.hasNext()) {
				String currentWord = sc.next();
				for(int i = 0; i < wordArray.length; i++) {
					if(wordArray[i].getWord().equals(currentWord)) {
						wordArray[i].setOccurrence();
						break;
					}
				}

			}
		}catch(Exception e) {
			e.getMessage();
		}


	for(int i = 0; i < wordArray.length; i++) {
		for(int j = i+1; j < wordArray.length; j++) {
			if( wordArray[i].getOccurrence() < wordArray[j].getOccurrence()) {
				WordObject temp = wordArray[i];
				wordArray[i] = wordArray[j];
				wordArray[j] = temp;
				
			}
		}
	}
		
		for(WordObject word : wordArray) {
			System.out.println(word.getWord() + ": " + word.getOccurrence());
			
		}
 		
		
		
		
		
		
		
		
	}
	
	

 }

