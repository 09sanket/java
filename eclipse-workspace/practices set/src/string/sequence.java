package string;

public class sequence {

	public static void main(String[] args) {
		
		String str1 = "PHP  exercises and python exercises";
		String str2 = " and";
		System.out.println(" orignal String : " + str1);
		System.out.println(" specified sequence of char values : " + str2);
		System.out.println(str1.contains(str2));
	}

}
