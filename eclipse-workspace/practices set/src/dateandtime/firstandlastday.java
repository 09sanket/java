package dateandtime;

import java.util.*;
import java. time.*;
import java.text.*;

public class firstandlastday {

	public static void main(String[] args) {
		
		// get calendar to set current date and time
		Calendar c= Calendar.getInstance();
		
		//set the calendar to monday of the cuurrent week
		c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY );
		
		System.out.println();
		//PRINT DATES OF THE CUURRENT WEEK STARTING ON MODAY
		
		DateFormat df = new SimpleDateFormat(" EEE dd/MM/yyyy");
		System.out.println( df.format(c.getTime()));
		
		for(int i=0; i<7; i++);
		{
			c.add(Calendar.DATE,6);
			
			
		}
		System.out.println(df.format(c.getTime()));
		System.out.println();
		
	}

}
