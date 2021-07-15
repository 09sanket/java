package encapsulation;

public class student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age ) {
		if(age>20) {
			System.out.println(" you are too old");
		}else {
		this.age = age;
	}
}

}
