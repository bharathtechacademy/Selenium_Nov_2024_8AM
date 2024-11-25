package language.basics;

public class MethodsInJava3 {
	
	int empId = 0;
	
	MethodsInJava3(int id){
		empId = id;
	}
//	
//	MethodsInJava3(){
//		
//	}
	
	public void printEmpDetails(String empName) {
		System.out.println(empId);
		System.out.println(empName);
	}
	
	public void printEmpAddress(String empAddress) {
		System.out.println(empId);
		System.out.println(empAddress);
	}
	
	public void printEmpMarks(int empMarks) {
		System.out.println(empId);
		System.out.println(empMarks);
	}

}
