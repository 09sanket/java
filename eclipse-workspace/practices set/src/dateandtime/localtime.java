package dateandtime;
import java.time.*;

public class localtime {

	public static void main(String[] args) {
		
		LocalTime time= LocalTime.now();
		
		LocalTime newTime = time.plusHours(2);
		System.out.println();
		System.out.println(" time after 3 hour: "+newTime);
		System.out.println();
		
	}

}
