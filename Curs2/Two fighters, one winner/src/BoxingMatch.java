
public class BoxingMatch {
	private Fighter Fighter1;
	private Fighter Fighter2;
	
    //Constructor care primeste ca parametri doua obiecte
	public BoxingMatch(Fighter firstFighter, Fighter secondFighter) {
		Fighter1 = firstFighter;
		Fighter2 = secondFighter;
		
	}
	

	public String fight() {
		int fighter1Health = Fighter1.getHealth();
		int fighter2Health = Fighter2.getHealth();
		String name;
		
		while(fighter1Health > 0 && fighter2Health > 0) {
			/*Cele doua variabile se actualizeaza constant in functie de atacurile fiecarui "luptator"
			si sunt folosite mai apoi ca argumente ale functiei attack()*/
			fighter2Health = Fighter1.attack(fighter2Health, Fighter1.getDamagePerAttack());
			fighter1Health = Fighter2.attack(fighter1Health, Fighter2.getDamagePerAttack());
			
		}
		
		
		if(fighter1Health > fighter2Health ) {
			name = Fighter1.getName();
		}else {
			name = Fighter2.getName();
			
		}
		
		return name + " wins!";
	}
	
}

