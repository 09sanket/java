package conditional;

import java.util.Scanner;

public class wekday2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(" input number : ");
		int day = in.nextInt();
		
		System.out.println("getDayName(day)");
		
		
	}
	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1: dayName = "monday"; break;
		case 2: dayName = "tuesday"; break;
		case 3: dayName = "wednesday"; break;
		case 4: dayName = "thursday"; break;
		}
		 return dayName;
	}

  }
