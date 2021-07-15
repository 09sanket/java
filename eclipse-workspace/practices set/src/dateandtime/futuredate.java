package dateandtime;
import java.util.*;

public class futuredate {

	public static void main(String[] args) {
		
		Calendar cal = Calendar .getInstance();
		Date cdate = cal.getTime();
		
		//get next year 
		cal.add(Calendar.YEAR,1);
		Date nyear = cal.getTime();
			
		// privious year
		cal.add(Calendar.YEAR,-2);
		Date 	pyear = cal.getTime();
		
		System.out.println(" \n current date :"+ cdate);
		System.out.println(" \ndate before 1 year :" +pyear);
		System.out.println("\ndate after 1 yeara: "+nyear+"\n");
			
		
	}

}
