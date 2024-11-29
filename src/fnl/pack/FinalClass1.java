package fnl.pack;

public class FinalClass1 {
	
	//final non-access modifier can make any property as final property (we cannot modify any more)
	
	//final can be used before data, method and before class as well
	
	//final data cannot be modified	
	//final method can't allow overriding
	//final class won't allow inheritance
	
	
	final String name = "Bharath";
	
//	public void changeName(String newName) {
//		name = newName;
//	}
	
	public final void printEmpId() {
		System.out.println(1234);
	}
	
	public void printAddress() {
		System.out.println("Telangana");
	}

	public static void main(String[] args) {
		

	}

}
