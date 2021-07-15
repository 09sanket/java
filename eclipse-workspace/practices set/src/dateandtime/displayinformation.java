package dateandtime;
import java.util.*;


public class displayinformation {

	public static void main(String[] args) {
		
		//creat default calender
		Calendar cal = Calendar.getInstance();
		
		//get display information of current date from the calendder
		
		System.out.println();
		System.out.println(" year : " + cal.get(Calendar.YEAR));
		System.out.println(" month : "+ cal.get(Calendar.MONTH));
		System.out.println(" day : "+cal.get(Calendar.DATE));
		System.out.println(" hour : "+ cal.get(Calendar.HOUR));
		System.out.println("minute :"+ cal.get(Calendar.MINUTE));
		System.out.println(" second : "+ cal.get(Calendar.SECOND));
		System.out.println();
		
		
		
	}

}
