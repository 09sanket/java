package conditional;

import java.util.Scanner;

public class table5 {

	public static void main(String[] args) {
		
		int j, n;
		
		System.out.println(" input the number(table to be calculated):");{
			
			Scanner in = new Scanner(System.in);
			n=in.nextInt();
			
			System.out.println(" \n");
			for( j=0; j<=10; j++)
				
				System.out.println(n+" X "+j+" = " +n*j);
			
			
		}
		
		
		
	}

}
