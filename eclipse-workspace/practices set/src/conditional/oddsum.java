package conditional;

import java.util.Scanner;

public class oddsum {

	public static void main(String[] args) {
		
		int i,n,sum=0;
		
		System.out.println(" input number of terms is : ");{
			
			Scanner in = new Scanner(System.in);
			n=in.nextInt();
			System.out.println(" \n the odd numbers are : ");
			for( i=1; i<=n;i++) {
				
				System.out.println(2*i-1);
				sum+=2*i-1;
			}
			System.out.println(" the sum of odd natural number upto " +n+ "terms is: "+sum);
		}
		
		
	}

}
