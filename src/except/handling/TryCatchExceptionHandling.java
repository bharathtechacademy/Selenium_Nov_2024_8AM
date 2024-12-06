package except.handling;

public class TryCatchExceptionHandling {

//	try {
//		
//	}catch(Exception e) {
//		
//	}

	public static void main(String[] args) {

		try {
			int i = 10;
			int j = 5;
			j += 5;
			System.out.println(i / (i - j));
		} catch (Exception e) {
			System.out.println(1/0);
			e.printStackTrace();
			System.out.println("There is an Error in Program");
		}finally {
			System.out.println("Execution Completed");
		}

		
		

		String[] empNames = new String[3];
		try {
			empNames[0] = "Anusha";
			empNames[1] = "Kiran";
			empNames[2] = "Bharath";
			empNames[3] = "Surya";
		} catch (Exception e) {
			empNames[3] = "Surya";
			e.printStackTrace();
			System.out.println("There is an Error in Array");
		}finally {
			System.out.println("Execution Completed");
		}
	}

}
