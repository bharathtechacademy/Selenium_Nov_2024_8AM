package interviews;

public class AllPossibleCombinations {

	public static void main(String[] args) {
		
		String input = "i love india";
		
		input = input.replace(" ", "");
		
		char[] chars = input.toCharArray();
		
		for(int i=0;i<chars.length; i++) {
			for(int j=0; j<chars.length;j++) {
				if(i==j) {
					continue;
				}
				System.out.println(input.charAt(i)+""+input.charAt(j));				
				
			}			
		}

	}

}
