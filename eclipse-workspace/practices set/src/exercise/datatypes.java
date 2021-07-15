package exercise;

import java.util.Scanner;

public class datatypes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input a degree in fehrenheit");
		double fahrenheit = input.nextDouble();
		
		
		double celsius = ((5*( fahrenheit - 32.0)) / 9.0);
		System.out.println("input a degre in fahrenheit is equal to" + celsius +"in celsius");
		
		
		

	}

}
