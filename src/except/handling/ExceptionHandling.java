package except.handling;

public class ExceptionHandling {
	
	//Exception Handling ==> 
	
	// Throws Declaration ==> Can be used when we know about the exception before itself.	
	
	// Try/Catch Exception Handling  ==> Can be used when we are not sure about the exception
	
	// Throw an customized exception  ==> Can be used when we want to create our own exception

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Kiran");
		Thread.sleep(2000);
		System.out.println("Surya");
		Thread.sleep(3000);
		System.out.println("Akshay");		

	}

}
