
public class FooBarQixChallenge {
	
	public String compute2(int number) {
		String first ="";
	
			
		if(number % 3 == 0) {
			first +="Foo";	
		}
		
		if(number % 5 == 0) {
			first += "Bar";			
		}
		
		if(number % 7 == 0) {
			first += "Qix";
		}
		
		String nr = Integer.toString(number);
		String second = ""; 
		
		for(int i = 0; i < nr.length(); i++) {
			if(nr.charAt(i) == '0') {
				second += '*';
				
			}else if(nr.charAt(i) == '7') {
				second +="Qix";
				
			}else if(nr.charAt(i) == '5') {
				second +="Bar";
				
			}else if(nr.charAt(i) == '3') {
				second += "Foo";
			}
		}
		
		String result = first + second;
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		FooBarQixChallenge obj = new FooBarQixChallenge();
		
		for(int i = 100; i <= 105; i++) {
			
			if(obj.compute2(i).equals("")) {
				System.out.println(i + " => " + i);
				
			}else {
				System.out.println(i + " => " + obj.compute2(i));
			}
			
		

	}

 }
}
