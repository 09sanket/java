package oops.polymorphism;

public class main {

	public static void main(String[] args) {
		
		animal myanimal =new animal();
		animal mypig = new pig();
		animal mydog = new dog();
		
		myanimal.animalsound();
		mypig.animalsound();
		mydog.animalsound();

	}

}
