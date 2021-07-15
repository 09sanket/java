package conditional;

import java.util.Scanner;

public class wekday {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(" input number : ");
		int day = in.nextInt();
		
		System.out.print(getDayName(day));
	}
		
		public static String  getDayName(int day) {
			String  dayName = "  ";
			switch (day) {
			
			case 1: dayName = "monday"; break;
			
			case 2: dayName = "tuesday"; break;
			case 3: dayName = "wednesday"; break;
			case 4: dayName = "thursday"; break;
			case 5: dayName = "friday"; break;
			case 6: dayName = "saturday"; break;
			case 7: dayName = "sunday"; break;
			
			default : dayName = "invalid day range";
			
			
			}
			
			return dayName;
			
		
		
	}

  }
