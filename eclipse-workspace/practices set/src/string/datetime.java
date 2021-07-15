package string;

import java.util.Calendar;

public class datetime {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(" current date and time :");
		System.out.format("%tB %te , %ty%n", c,c,c);
		System.out.format(" %tl:%tM %tp%n",c,c,c);
	}

}
