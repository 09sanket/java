package basic;
import java.util.Scanner;

public class printhello {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println(" first num: ");
		int num1=in.nextInt();
		
		System.out.println("second num: ");
		int num2=in.nextInt();
		
		System.out.println(" third num: ");
		int num3=in.nextInt();
		
		if( num1==num2 && num2==num3 && num3==num1)
		{
			System.out.println(" all numberts are equal");
	}
	else {
		System.out.println(" numbers are not equal");
}
	}

}                     
