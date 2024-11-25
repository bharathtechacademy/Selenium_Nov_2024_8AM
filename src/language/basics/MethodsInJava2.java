package language.basics;

public class MethodsInJava2 {
	
	
	public static void main(String[] args) {
		
		MethodsInJava2 obj = new MethodsInJava2();
		obj.launchBrowserAndLaunchApplication("Chrome","www.google.com");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutAndCloseTheBrowser();

		obj.launchBrowserAndLaunchApplication("Edge","www.amazon.com");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseTheBrowser();

		obj.launchBrowserAndLaunchApplication("Firefox","www.yahoo.com");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseTheBrowser();
		
		obj.launchBrowserAndLaunchApplication("Firefox","www.yahoo.com");
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseTheBrowser();
		
		obj.launchBrowserAndLaunchApplication();
		obj.loginIntoApplication();
		System.out.println("Execute Test Case 4 Steps Related to Accounty Section and copy the Bank Balnce....");
		obj.logoutAndCloseTheBrowser();

	}

	void launchBrowserAndLaunchApplication(){
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url and launch application");
	}
	
	void launchBrowserAndLaunchApplication(String browserName, String url){
		System.out.println("Launch the "+browserName+" browser");
		System.out.println("Enter "+url+" and launch application");
	}
	
//	void launchEdgeBrowserAndLaunchApplication(){
//		System.out.println("Launch the Edge browser");
//		System.out.println("Enter url and launch application");
//	}
//	
//	void launchFirefoxBrowserAndLaunchApplication(){
//		System.out.println("Launch the Firefox browser");
//		System.out.println("Enter url and launch application");
//	}

	void loginIntoApplication(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	void logoutAndCloseTheBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}
	
	int checkAccountsAndGetBalance(){
		System.out.println("Execute Test Case 4 Steps Related to Accounty Section and copy the Bank Balnce....");
		int balance = 10000;
		return balance;
	}

}
