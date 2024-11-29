package non.access.pack;

public class SynchronizedClasses {
	
	//Synchronized ==> One thread at a time 
	
	//Multi-Threading ==> 
	
	void launchBrowserAndLaunchApplication(){
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url and launch application");
	}
	
	synchronized void launchBrowserAndLaunchApplication(String browserName, String url){
		System.out.println("Launch the "+browserName+" browser");
		System.out.println("Enter "+url+" and launch application");
	}
	
	 void loginIntoApplication(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	 synchronized void logoutAndCloseTheBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
