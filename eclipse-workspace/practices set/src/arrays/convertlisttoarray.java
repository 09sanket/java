package arrays;

import java.util.ArrayList;
import java.util.Arrays;
public class convertlisttoarray {

	public static void main(String[] args) {
		
		ArrayList<String>List = new ArrayList<String>();
		
		List.add(" python ");
		 
		List.add(" java ");
		
		List.add(" php ");
		
		List.add(" html ");
		List.add(" c ");
		
		String[] my_array = new String[List.size()];
		
		List.toArray(my_array);
		 for(String string : my_array)
		 {
			 System.out.println(string);
		 }
		
		
	}

}
