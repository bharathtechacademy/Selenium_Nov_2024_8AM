package keyWords;

public class KeyWordsClass2 extends KeyWordsClass1{
	
	String name = "Java";
	
	public void printName(String name) {
		System.out.println(name);
//		System.out.println(new KeyWordsClass2().name);		
//		System.out.println(new KeyWordsClass1().name);		
		System.out.println(super.name);
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		KeyWordsClass2 obj = new KeyWordsClass2();
		obj.printName("API");
	}

}
