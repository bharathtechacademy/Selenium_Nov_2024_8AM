package stringOps.dataConversions;

public class StringOperations {

	public static void main(String[] kiran ) {
		
	//Store String in Java	
	String value =" Username : Admin | Password : admin123 ";
	
	//Total Chars available in the String ==> String.length();
	int totalChars = value.length();
	System.out.println("Total Chars available in the String :"+totalChars);
	
	//Get Specific Char from the String ==> String.charAt(Index); //Index starts from Zero
	System.out.println("Get 5th Index Char from the String: "+value.charAt(5));
	
	//Reverse the String
	String reverseWord ="";
	for(int i=value.length()-1;i>=0;i--) {
		reverseWord=reverseWord+value.charAt(i);
	}
	System.out.println(reverseWord);
		
	//Remove unwanted spaces from the String ==> String.trim();
	System.out.println(value);
	System.out.println(value.trim());
	
	//Remove all spaces from the String ==> String.replace(oldChar,newChar);
	System.out.println(value.replace(" ", ""));
	
	//Remove all alphabets from the String ==> String.replaceAll(regularExp,newChar);
	System.out.println(value.replaceAll("[a-zA-Z]", ""));
	
	//Remove all numbers from the String ==> String.replaceAll(regularExp,newChar);
	System.out.println(value.replaceAll("[0-9]", ""));
	
	//Remove all special chars from the String ==> String.replaceAll(regularExp,newChar);
	System.out.println(value.replaceAll("[^0-9a-zA-Z]", ""));
	
	//Update the case of chars in String ==> String.toUpperCase(), String.toLowerCase();
	System.out.println(value);
	System.out.println(value.toUpperCase());
	System.out.println(value.toLowerCase());
	
	//Get Specific part of the String (static) ==> String.subString(beginingIndex) , String.subString(beginingIndex, endIndex+1)
	System.out.println(value.substring(12, 17));
	System.out.println(value.substring(31));
	
	//Get Specific part of the String (dynamic) ==> String.split(regExp);
	String [] splittedValue = value.split(" ");
	System.out.println(splittedValue[3]);
	System.out.println(splittedValue[7]);
	
	// Compare Strings 
	String name = "Bharath";
	System.out.println(name.equals("Bharath"));
	System.out.println(name.equals("bharath"));
	System.out.println(name.equalsIgnoreCase("bharath"));
	System.out.println(name.contains("hara"));
	System.out.println(name.contains("Hara"));
	System.out.println(name.startsWith("Bha"));
	System.out.println(name.endsWith("ath"));
	
	// How to store text in Java other than String
	
	//String ==> immutable class
	//StringBuffer ==> mutable class ==> Synchronized
	//StringBuilder ==> mutable class  ==> Non-Synchronized
	
	String empName = "Bharath";
	StringBuffer sbf = new StringBuffer("Bharath");
	StringBuilder sbd = new StringBuilder("Bharath");
	
	System.out.println(empName);
	System.out.println(sbf);
	System.out.println(sbd);
	
	//immutable
	empName.concat(" Reddy");
	System.out.println(empName);
	
	//mutable
	sbf.append(" Reddy");
	System.out.println(sbf);
	
	sbd.append(" Reddy");
	System.out.println(sbd);
	
	
	}

}
