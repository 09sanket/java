package conditional;

import java.util.Scanner;

public class pyramidno {

	public static void main(String[] args) {
		
		int i,j,n,s,x;
		System.out.println(" input number of rows :");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		
		s=n+4-1;
		for(i=1;i<=n;i++)
		{
			for(x=s;x!=0;x--)
			{
				System.out.println(" ");
			}
			 for( j=1;j<=i;j++)
			 {
				 System.out.println(i+ " ");
			 }
			 System.out.println();
			 s--;
		}




	}

}
