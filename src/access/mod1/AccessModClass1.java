package access.mod1;

public class AccessModClass1 {

	private String name = "Bhargavi";

	public void printEmpId() {
		System.out.println(1234);
	}
	
	public String getName() {
		return name;
	}
	
	public void changeName(String newName) {
		name = newName;
	}

	public static void main(String[] args) {
		AccessModClass1 obj = new AccessModClass1();
		System.out.println(obj.name);
		obj.printEmpId();
	}

}
