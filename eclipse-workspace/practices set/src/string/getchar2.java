package string;

public class getchar2 {

	public static void main(String[] args) {
		
	String str = " w3resource.com";
	System.out.println("orignal String :" +str);
	
	int val1 = str.codePointAt(1);
	int val2 = str.codePointAt(9);
	
	System.out.println("  character (unicode point) =  " +val1);
	System.out.println(" character(unicode point ="+ val2);
	
	
	}

}
