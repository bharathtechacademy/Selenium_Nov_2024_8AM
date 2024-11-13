package language.basics;

public class ClassesAndObjects1 {
	
	String name = "Kiran";
	
	int empId = 1234;
	
	String [] Address = {"Hyderabad", "Telangana"};	
	

	public static void main(String[] args) {
		
		//Object ==> new instance of the class
		ClassesAndObjects1 obj = new ClassesAndObjects1(); //Object of Class1

		System.out.println(obj.name);
		System.out.println(obj.empId);
		System.out.println(obj.Address[1]);
		

	}

}
