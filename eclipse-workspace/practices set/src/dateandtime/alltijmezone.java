package dateandtime;
import java.time.*;
public class alltijmezone {

	public static void main(String[] args) {
		
		ZoneId.SHORT_IDS.keySet().
		stream().forEach( 
		zonekey ->System.out.println(" "+ZoneId.of(ZoneId.SHORT_IDS.get(zonekey)) +" :" + LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zonekey)))));
		
		
		
	}

}
