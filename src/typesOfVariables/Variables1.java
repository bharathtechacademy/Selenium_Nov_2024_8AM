package typesOfVariables;

public class Variables1 {
	
	//1. Local Variable ==> Variable declared inside the block/method
	//2. Instance Variable ==> Variable declared at class level (outside of the method)
	//3. Global Variable ==> Variable declared at class level along with static keyword
	
	
	String name2 = "Divya"; //Instance Variable
	
	static String name3 ="Kiran"; //Global Variable

	public static void main(String[] args) {		
		String name1 = "Bhargavi"; //Local Variable
		System.out.println(name3);	
		System.out.println(name1);
	}
	
	public void printName() {
//		System.out.println(name1);
		System.out.println(name2);
	}	

}



