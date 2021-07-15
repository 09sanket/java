package dateandtime;

import java.util.Calendar;

public class monthdate {

	public static void main(String[] args) {
	
		
		Calendar cal = Calendar.getInstance();
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println();
		System.out.println(" number of days of the  current month:"+days);
		System.out.println();
	}

}
