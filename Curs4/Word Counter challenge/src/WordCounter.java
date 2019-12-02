import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCounter {
	//se verifica daca cuvantul curent exista deja in sir
	//daca exista se returneaza indexul iar in caz contrar se returneaza -1 
	public int isPresent(ArrayList<Helper> wordArray, String searchedWord) {
		for(int i = 0; i < wordArray.size(); i++) {
			if(searchedWord.equals(wordArray.get(i).getWord())) {
				return i;
				
			}
		}
		
		return -1;
		
		
	}

	
	public static void main(String[] args) throws FileNotFoundException {
		WordCounter obj = new WordCounter();
		File myFile = new File("InputText.txt");
		Scanner sc = new Scanner(myFile);
		sc.useDelimiter(" ");
		int count = 0;
      
		ArrayList<Helper> wordArray = new ArrayList<Helper>();
	
		//bucla se executa cat timp exista cuvinte de parcurs
		while(sc.hasNext()) {
			count = 0;
			String currentWord = sc.next();//cuvantul curent
			int index = obj.isPresent(wordArray, currentWord);
			
			if(index == -1) {
			//daca cuvantul nu exista in sir se creaza un nou obiect care sa il contina	
			wordArray.add(new Helper(currentWord,++count));
			
			}else {
				//daca exista deja se incrementeaza valoarea frecventei cuvantului respectiv
				wordArray.get(index).setFrequency();
				
			}
			
		}
		

	    //se sorteaza sirul de cuvinte pe baza valorii frecventei
		Collections.sort(wordArray, new Comparator<Helper>() {
			@Override
			public int compare(Helper obj1, Helper obj2) {
		
			 return Integer.valueOf(obj1.getFrequency()).compareTo(Integer.valueOf(obj2.getFrequency()));
			}
		});
		
		//se afiseaza cele mai frecvente 10 cuvinte existente in textul selectat
		System.out.println("Top 10 word frequency list:");

		for(int i = wordArray.size()-1; i > 0; i--, count++) {
			if(count <= 10) {
				System.out.print(wordArray.get(i).getWord() + " " + wordArray.get(i).getFrequency());
				System.out.println();
			}
		}
		
	
		

		
	}
}
