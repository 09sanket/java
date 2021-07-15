package exercise;

import java.util.Scanner;

public class displaysquare {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("input the side length value:");
		double val = in.nextDouble();
		
		System.out.printf("square: %12.2f\n",val* val);
		System.out.printf(" cube: %14.2f\n",val*val*val);

	}

}
