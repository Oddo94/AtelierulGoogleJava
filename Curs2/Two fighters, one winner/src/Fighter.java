
public class Fighter {
	private String name;
	private int health;
	private int damagePerAttack;
	
	
	public Fighter(String name, int health, int damagePerAttack) {
		this.name = name;
		this.health = health;
		this.damagePerAttack = damagePerAttack;
	}
	
	public int attack(int opponentHealth, int attackerDamagePerAttack) {
		opponentHealth -= attackerDamagePerAttack;
		
		return opponentHealth;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		
		return health;
	}
	
	public int getDamagePerAttack() {
		
		return damagePerAttack;
	}

}
