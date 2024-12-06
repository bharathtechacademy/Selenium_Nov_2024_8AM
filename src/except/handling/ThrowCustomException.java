package except.handling;

public class ThrowCustomException {

	public static void main(String[] args) throws Exception {
		int age = 10;

		if (age < 18) {
			throw new Exception("Not Eligible to Vote");
		} else {
			System.out.println("Eligible to Vote");
		}

		System.out.println("Execution Completed");

	}

}
