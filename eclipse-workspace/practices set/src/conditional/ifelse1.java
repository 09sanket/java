package conditional;

import java.util.Scanner;

public class ifelse1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(" input a number");
		
		int n=in.nextInt();
		
		
		if( n>0) {
			System.out.println("positive number");
		}
		else if(n<0){
			System.out.println("nrgative number");
			
		}else {
			System.out.println("zero  no.");
		}
	}

}
