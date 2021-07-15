package string;

public class replacechar {

	public static void main(String[] args) {
		
		String str = " the wickets taken by sanku.";
		
		// replace all s to t
		String new_str =str.replace("sanku","panku");
		
		//display string from comparison
		System.out.println(" orignal string : "+str);
		System.out.println(" new string : "+new_str);
	}

}
