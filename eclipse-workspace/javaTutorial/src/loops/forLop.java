package loops;

public class forLop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<100; i=i+1) {
			System.out.println("hello world" +i);
		}
		
		for( int i =0; i<=100; i=i+2) {
			System.out.println(i);
		}
		
		int sum =0;
		int n=50;
		for(int i=1; i<= n; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		for(int i=100; i>0; i=i-1) {
			System.out.println(i);
		}
		
		int tableOf = 4;
		for( int i=1; i<=12; i++) {
			System.out.println(tableOf *i);
			
		}
		
	}

}
