
public class Main {
	
	public static void main(String[] args) {
		Fighter Fighter1 = new Fighter("Rocky", 100);
		Fighter Fighter2 = new Fighter("Mayweather", 100);
		
		BoxingMatch match1 = new BoxingMatch(Fighter1, Fighter2);
		String winner = match1.fight();
		
		System.out.println(winner);
			
	}

}
