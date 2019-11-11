
public class Fish extends Animal implements Pet {
    private String name;
    
    
	public Fish(){
		super(0);
	}
		

	
	public String getName() {
		return name;
	}


	
	public void setName(String name) {
		this.name = name;
		
	}


	public void play() {
		System.out.println(name + " is playing...");
		
	}
	
	public void walk(String name) {
		System.out.println(name + " can't walk!");
	}


	
	public void eat() {
	System.out.println("Fish is eating...");
		
	}



}
