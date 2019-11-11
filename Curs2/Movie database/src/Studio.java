
public class Studio {
	private String nume;
	private Film[] filme;

	public Studio(String nume, Film[] filme) {
		this.nume = nume;
		this.filme = filme;

	}

	public Studio(){

	}



	public void studioWithMinimum2Movies(Studio[] studioDatabase) {
		int count;
		
        //Se verifica numarul de filme create de fiecare studio
		for(Studio studio : studioDatabase) {
            count = 0;
            
			for(Film film : studio.filme) {
				count++;
				
				if(count >= 2) {
					System.out.println(studio.nume);
					break;
				}
			}

			
	}
	
	
	}
}
