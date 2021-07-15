package string;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= " sanku is a cricketer ";
		String str2 = " sanku is a footballer ";
		
		
		System.out.println(" String 1: " +str1);
		System.out.println(" String2 :"+str2);
		
		int result = str1.compareTo(str2);
		
		if( result <0)
		{
			System.out.println("\"" +str1+ "\"" + " is less than" + "\""+ str2+ "\"");
		}
		else if(result == 0)
		{
			System.out.println("\"" +str1+ "\"" + " is equal to" + "\""+ str2+ "\"");
		}
		else {
			System.out.println("\"" +str1+ "\"" + "  is greater than" + "\""+ str2+ "\"");
		}

	}

}
