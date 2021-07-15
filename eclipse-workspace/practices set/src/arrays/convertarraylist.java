package arrays;

import java.util.ArrayList;
import java.util.Arrays;
public class convertarraylist {

	public static void main(String[] args) {
		
		String[] my_array = new String[]{"java","python","php"};		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));
		
		System.out.println(list);
	}
	
	
	
	

}
