package language.basics;

public class ClassesAndObjects3 extends ClassesAndObjects1{
	
	int phone = 345678;
	
	int empId = 1235;

	public static void main(String[] args) {
		
		ClassesAndObjects3 obj = new ClassesAndObjects3();
		
		System.out.println(obj.name);
		System.out.println(obj.empId);
		System.out.println(new ClassesAndObjects1().empId);
		System.out.println(obj.phone);

	}

}
