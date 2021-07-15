package oops.polymorphism;

public class animal {
	
	public void animalsound() {
		System.out.println("the animal makes a sound");
	}

}

class pig extends animal {
	
	public void animalsound() {
		System.out.println("the pig says: wee wee");
	}
}

class dog extends animal{
	
	public void animalsound() {
		System.out.println(" the dog says: bow wow");
	}
}
