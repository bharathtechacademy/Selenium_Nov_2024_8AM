package abs.pack;

public class AbstractClass2 extends AbstractClass1{
	
	

	public static void main(String[] args) {
		// AbstractClass1 obj = new AbstractClass1();
	}

	@Override //annotation
	public void printNameAndId(String empName, int empId) {
		System.out.println(empName);
		System.out.println(empId);
	}

	@Override
	public void printAddress() {
		// TODO Auto-generated method stub
		
	}



}
