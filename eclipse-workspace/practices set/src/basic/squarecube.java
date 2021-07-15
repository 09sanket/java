package basic;
import java.util.Scanner;

public class squarecube {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.printf("  input the side lngth value: ");
		double val = in.nextDouble();
		
		System.out.printf(" square: %12.2f\n ", val*val);
		System.out.printf( " cube : %14.2f\n", val*val*val);
		
	
		
	}

}
