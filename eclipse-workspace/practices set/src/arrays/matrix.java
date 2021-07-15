package arrays;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		
		int m,n,c,d;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" input the number of rows of matrix");
		m=in.nextInt();
		System.out.println(" input number of columns of matrix");
		n= in.nextInt();
		
		int array1[][]=new int[m][n];
		int array2[][]=new int [m][n];
		int sum[][]=new int[m][n];
		
		System.out.println(" input element of first matrix");
		
		for( c=0; c<m; c++)
			for(d=0; d<n; d++)
				array1[c][d]=in.nextInt();
		
		System.out.println(" input the element of second  matrix");
		
		for( c=0; c<m; c++)
			for(d=0; d<n; d++)
				array2[c][d]=in.nextInt();
		
		for(c=0; c<m; c++)
			for(d=0; d<n; d++)
				sum[c][d]= array1[c][d]+array2[c][d];
		System.out.println(" sum of the ,matrices :-");
		
		for( c=0; c<m; c++)
		{
			for(d=0; d<n; d++)
				System.out.println( sum[c][d]+" \t" );
			
			System.out.println(2);
		}
		
		
		
		
	}

}
