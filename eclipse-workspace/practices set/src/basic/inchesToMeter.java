package basic;
import java.util.Scanner;

public class inchesToMeter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a value for inch :");
		double inch= input.nextDouble();
		double meters= inch*0.254;
		System.out.println(inch + " inch is" +meters+" meters");
	}

}
