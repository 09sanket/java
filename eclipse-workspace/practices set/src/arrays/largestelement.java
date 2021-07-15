package arrays;

import java.util.Arrays;

public class largestelement {

	public static void main(String[] args) {
		
		int[] my_array = {
				
				10789,2035,1899,1456,
				1458,2458,1254,1472};
		System.out.println(" orignal numeric array : " +Arrays.toString( my_array));
		Arrays.sort(my_array);
		int index = my_array.length-1;
		while(my_array[index]== my_array[my_array.length-1]) {
			index--;
		
		}
		System.out.println(" second largest value: "+my_array[index]);
		
	}

}
