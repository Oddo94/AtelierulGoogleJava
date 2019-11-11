
public class Film {
	private int anAparitie;
	private String nume;
	private Actor[] actori;
	
	public Film(int anAparitie, String nume, Actor[] actori) {
		this.anAparitie = anAparitie;
		this.nume = nume;
		this.actori = actori;//initializarea variabilei care contine sirul de actori cu un sir trimis ca argument constructorului
	}

	public Film() {
		
	}
	
	public void moviesWithCertainActor(Film[] filmDatabase, String actorName) {
		boolean wasFound = false;

		System.out.println("Lista de filme in care joaca "  + "'" + actorName + "'" + ":");
		
		//Se verifica numele fiecarui actor din fiecare film
		for(Film film : filmDatabase) {
			
			for(Actor actor : film.getActor()) {
				
				if(actor.getName().equals(actorName)) {
					System.out.println(film.getName());
					wasFound = true;
				}

			}
		}

		if(!wasFound) {
			System.out.print("Empty!");
		}


	}

	public void moviesWihActorAboveFifty(Film[] filmDatabase) {
		boolean wasFound = false;

		System.out.println("Lista de filme cu actor/actori de peste 50 de ani:");

		for(Film film : filmDatabase) {
			for(Actor actor : film.getActor()) {
				if(actor.getAge() > 50 ) {
					System.out.println(film.getName());
					wasFound = true;
					break;
				}
			}
		}

		if(!wasFound) {
			System.out.print("Empty!");
		}

	}
	
	
	
	
	public String getName() {
		return nume;
	}
	
	public Actor[] getActor() {
		return actori;
	}
		
		
			
		
	}

