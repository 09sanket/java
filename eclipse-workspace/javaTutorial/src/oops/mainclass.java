package oops;

class cat {
	boolean husfur;
	String colour;
	
	int legs,eyes;
	
	
	
	
	public void walk() {
		System.out.println("cat is walking");
	}
	
	public void discription() {
		System.out.println("my cat has" + legs+" legs and" + eyes +"eyes");
	}
}

public class mainclass {
	
	

	public static void main(String[] args) {
		
		cat cat1 = new cat();
		
		cat1.legs=2;
				
		
		cat1.walk();
		cat1.discription();

	}

}
