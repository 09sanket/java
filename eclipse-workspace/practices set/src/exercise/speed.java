package exercise;

import java.util.Scanner;

public class speed {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		float timeSeconds;
		float mps,kph,mph;
		
		System.out.println(" input distance in meters ");
		float distance = Scanner.nextFloat();
		
		System.out.println(" input hour:");
		float hr= Scanner.nextFloat();	
		
		System.out.println(" input minutes");
		float min = Scanner.nextFloat();
		
		
		System.out.println("input seconds");
		float sec = Scanner.nextFloat();
		
		timeSeconds = (hr*3600)+(min*60)+sec;
		mps=distance/timeSeconds;
		kph= ( distance/1000.0f)/(timeSeconds/3600.0f);
		mph = kph/1.609f;
		
		System.out.println("your speed in meters/second is "+mps);
		System.out.println("your speed in km/h is"+kph);
		System.out.println("your speed in miles/h is "+mph);
		
		
		Scanner.close();
		
		
		
		
	}
	

	
	
}
