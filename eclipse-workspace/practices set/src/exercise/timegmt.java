package exercise;

import java.util.Scanner;

public class timegmt {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input the time zone offset to GMT:");
		long timeZoneChange = input.nextInt();
		
		long totalmilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalmilliseconds / 1000;
		
		long currentSeconds=totalSeconds %60;
		long totalMinutes = totalSeconds /60;
		long currentMinute= totalMinutes %60;
		long totalHours = totalMinutes/60;
		long currentHours = ((totalHours +timeZoneChange) %24);
		
		System.out.println(" current time is " + currentHours+ " ; "+currentMinute+ " ; "+currentSeconds);
	}

}
