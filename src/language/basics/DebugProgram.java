package language.basics;

public class DebugProgram {
	
	//Last line will display the line number along with hyperlink where we got Error
	//First line will display the details of Error and Location of Error documentation
	
	//Add breakpoint to start debugging process (double click on line number)

	public static void main(String[] args) {
		int i = 1;
		System.out.println("Step 1");
		System.out.println("Step 2"); // When we want to navigate over files (alt+ leftarrow) (alt+right arrow)
		System.out.println("Step 3");
		int j = i + 1; //Go to Specific line (Control+L)
		System.out.println(i / j);
		System.out.println("Step 5");
		System.out.println("Exeecution Completed"); //formatting (Control+Shift+f)
	}

}
