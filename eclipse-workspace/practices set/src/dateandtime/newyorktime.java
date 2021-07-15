package dateandtime;

import java.util.*;
public class newyorktime {
   public static void main(String[] args)
    {
     Calendar calIndia = Calendar.getInstance();
     calIndia.setTimeZone(TimeZone.getTimeZone("India"));
	    System.out.println(); 
      System.out.println("Time in india: " + calIndia.get(Calendar.HOUR_OF_DAY) + ":"
        + calIndia.get(Calendar.MINUTE)+":"+calIndia.get(Calendar.SECOND));
		   System.out.println(); 
    }
}
