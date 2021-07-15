package methods;

public class paasbyvalue {

	public static void main(String[] args) {
		
//		int c=34;
//		int d=12;
//		
//		swap(c,d);
//		System.out.println( c+" "+d);
//		
		
		dog c=new dog();
		c.legs =3;
		dog d=new dog();
		d.legs=2;
		
		swap(c,d);
		System.out.println(c+" "+d);
		
		

	}
	
	static void swap(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
	}
	static void swap(dog a,dog b) {
		dog temp =a;
		a=b;
		b=temp;
	}
     static void changedog(dog dog) {
    	 dog.legs = 6;
     }
}

class dog{
	 
	int legs;
}
