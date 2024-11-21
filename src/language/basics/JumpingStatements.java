package language.basics;

public class JumpingStatements {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			
			if(i>4 && i<7) {
				//continue;
				break;
			}
			
			System.out.println(i);
			
		}

	}	

}
