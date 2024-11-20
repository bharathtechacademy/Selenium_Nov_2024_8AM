package language.basics;

public class IfElseConditionalStatements {

	public static void main(String[] args) {

//		if(condition) {
//			
//		}else if(condition) {
//			
//		}else {
//			
//		}

		int age = 19;

		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not Eligible to vote");
		}

		int input = 0;

		if (input < 0) {
			System.out.println("It is Negative Number");
		} else if (input > 0) {
			System.out.println("It is Positive Number");
		} else {
			System.out.println("It is Zero");
		}

		double percentage = 92.3;

		if (percentage >= 85) {
			System.out.println("You got First Class");
			if(percentage >=90) {
				System.out.println("Hey, You are eligible for gold medal");
			}			
		} else if (percentage < 85 && percentage >= 60) {
			System.out.println("You got Second Class");
		} else if (percentage < 60 && percentage >= 40) {
			System.out.println("You got Third Class");
		} else {
			System.out.println("You Failed");
		}

	}

}
