package interviews;

public class PlaceSemiColon {

	public static void main(String[] args) {
		
		String name = "DileepKoyala";
		
		char [] chars = name.toCharArray();
		
		String output = "";
		
		for(int i=0;i<chars.length;i++) {
			output = output+name.charAt(i);
			if((i+1)%2==0) {
				output=output+";";
			}
			
		}
		
		System.out.println(output);
		

	}

}
