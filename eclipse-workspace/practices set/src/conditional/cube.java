package conditional;

import java.util.Scanner;

public class cube {

	public static void main(String[] args) {
		int i,n;
		
		System.out.println(" input number of terms :");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(i=1; i<=n;i++) {
			System.out.println(" number is :" +i+" an cube of " +i+"is:" +(i*i*i));
		}
		
		

	}

}
