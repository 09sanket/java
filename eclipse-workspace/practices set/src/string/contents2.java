package string;

public class contents2 {

	public static void main(String[] args) {
		
		String str1 = " python sanket";
		String str2=" python sankets";
		
		String end_str="et";
		
		boolean ends1 = str1.endsWith(end_str);
		boolean ends2 = str2.endsWith(end_str);
		
		System.out.println("\"" +str1 + "\"ends with"+"\"" + end_str + "\"?" +ends1);
		System.out.println("\"" +str2 + "\"ends with"+"\"" + end_str + "\"?" +ends2);
	}

}
