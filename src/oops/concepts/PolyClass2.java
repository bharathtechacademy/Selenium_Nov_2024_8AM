package oops.concepts;

public class PolyClass2 extends PolyClass1{
	
	public void printName() {
		System.out.println("Bharath");
		System.out.println(1234);
		System.out.println(true);
	}

	public void printName(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2();
		obj.printName();
		obj.printName("Kiran");
	}

}
