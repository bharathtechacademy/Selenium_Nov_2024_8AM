package intrfc.pack;

public interface InterfaceClass1 {
	
	//it's a 100% abstract class
	
	public abstract void printNameAndId(String empName, int empId);	
	
	public void printAddress();
	
	public void printMobile();
	
	default void printTest() {
		System.out.println("Test");
	}
	
	static void printPAN() {
		System.out.println("ABCD3456G");
	}
	
	private void printVisaDetails() {
		System.out.println("VSAG4269876");
	}

}
