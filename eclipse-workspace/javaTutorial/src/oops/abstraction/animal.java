package oops.abstraction;


 //abstract class
abstract  class animal {
	
	
// abstract method (does not have a body)	
public abstract void animalsound();

//regular method
public void sleep() {
	System.out.println("Zzz");
}

}

//subclass (inherit from animal)
class pig extends animal {
	
	public void animalsound() {
		//the body of animalsound() is provided here
		System.out.println(" the pig says: wee wee");
	}
	
}
