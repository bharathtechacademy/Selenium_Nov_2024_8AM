package fnl.pack;

public class FinalClass2 extends FinalClass1{
	
//	@Override
//	public void printEmpId() {
//		System.out.println(5678);
//	}	
	
	public void printAddress() {
		System.out.println("Andhra");
	}

	public static void main(String[] args) {
//		FinalClass1 obj = new FinalClass1();
//		obj.changeName("Sarath");
//		System.out.println(obj.name);
		
		FinalClass2 obj = new FinalClass2();
		obj.printEmpId();
		obj.printAddress();
	}

}
