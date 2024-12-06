package stringOps.dataConversions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataConversions {

	public static void main(String[] args) throws InterruptedException {
		
	// Any Data type into String ==> String.valueOf(otherData);
	int stdCode = 144;
	int phone = 345356;
	String code = String.valueOf(stdCode);
	System.out.println(code+phone);
	
	//String to integer
	String balance = "Account Balance is 9000";
	balance =balance.replaceAll("[^0-9]", "");
	int accountBalance = Integer.parseInt(balance);	
	System.out.println(accountBalance>=10000);
	
	//String to Double
	String pecentage = "Your Score is : 28.23%";
	pecentage = pecentage.replaceAll("[^0-9.]", "");
	double percent = Double.valueOf(pecentage);
	if(percent>40.0)
		System.out.println("Hey, You passed the exam");
	else
		System.out.println("Sorry, Failed");
	
	//Converting time stamp into String
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
	String uniqueId = sdf.format(Calendar.getInstance().getTime());
	System.out.println(uniqueId);
	
//	while (1>0) {		
//		String uniqueId = sdf.format(Calendar.getInstance().getTime());
//		System.out.println(uniqueId);		
//		System.out.println("Bharath"+uniqueId+"@gmail.com");
//		Thread.sleep(1000);
//	}
	
	// Type Casting  ==> Converting one data type into similar data type
	byte number = 23;
	int num = number;
	
	int codes = 123;
	byte newCode = (byte)codes;
	
	double per = 65.51;
	int n = (int)per;
	System.out.println(n);
	
	}

}
