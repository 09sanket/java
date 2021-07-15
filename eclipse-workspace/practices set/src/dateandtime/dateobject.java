package dateandtime;
import java.util.*;
public class dateobject {

	public static void main(String[] args) {
		
		int year = 2021;
		int month = 5; 
		int date = 23;
		
		;
		
		Calendar cal = Calendar.getInstance();
		
		cal.clear();
		System.out.println();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		cal.set(Calendar .DATE, date);
		
		System.out.println(cal.getTime());
		System.out.println();
		
		
		
	}

}
