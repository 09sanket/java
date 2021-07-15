package methods;

public class introductionmethod {

	public static void main(String[] args) {
		
		int firstNumber =34;
		int secondNumber =23;
		int result = maxOf(firstNumber , secondNumber);
		
		maxOf(5);  
		
		System.out.println(result);

		
	
		sayHi();

	}
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
			
		}else {
			return b;
		}
	}
		static void maxOf(float d){
			
		}
	
	
	static void sayHi() {
		System.out.println("Hii");
		System.out.println("sanku");
	}

}
