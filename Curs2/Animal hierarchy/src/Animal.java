
public abstract class Animal {
	protected int legs;
	
	protected Animal(int numberOfLegs) {
		legs = numberOfLegs;
	}
	
	public abstract void eat();
	
	public void walk(String name, int legs) {
		System.out.println(name + " walks on " + legs + " legs");
	}

}
