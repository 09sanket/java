package arrays;

public class sumaverage {

	public static void main(String[] args) {
		
		int[] num = new int[] {20,30,35,25,-16,60,-100};
		int sum =0;
		for(int i=0; i<num.length; i++)
			sum = sum+num[i];
		double average = sum/num.length;
		System.out.println(" average value of the array elements is : "+average);

	}

}
