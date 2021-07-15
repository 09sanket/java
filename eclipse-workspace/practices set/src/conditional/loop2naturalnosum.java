package conditional;

import java.util.Scanner;

public class loop2naturalnosum {

	public static void main(String[] args) {
		
		int i,n, sum=0;
		{
			Scanner in = new Scanner(System.in);
			System.out.println("  input number: ");
			n =in.nextInt();
		}
		System.out.println(" the irst n natural numbers are: "+n);
		
		for( i=1; i<=n; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println(" the sum of natural numbers upto " +n+ " terms : "+sum);
		

	}

}
