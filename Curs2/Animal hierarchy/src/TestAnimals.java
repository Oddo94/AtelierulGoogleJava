
public class TestAnimals {

	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();


		c.eat();
		c.setName("Felix");
		System.out.println(c.getName());
		c.play();
		c.walk(c.getName(),c.legs);


	
		
		
		
		
	}
}
