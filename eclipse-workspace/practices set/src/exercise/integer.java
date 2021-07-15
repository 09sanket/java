package exercise;

import java.util.Scanner;

public class integer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input a integer between 0 and 1000:");
		int num = input.nextInt();
		
		int firstDigit = num%10;
		int remainingNumber = num/10;
		int secondDigit = remainingNumber%10;
		remainingNumber = remainingNumber/10;
		int thirdDigit = remainingNumber%10;
		 remainingNumber = remainingNumber/10;
		 int fourthDigit = remainingNumber%10;
		 int sum = thirdDigit + secondDigit + firstDigit+fourthDigit;
		 
		 System.out.println("the sum of all digits in " +num+ " is "  + sum);
		 
		

	

		

	}

}
