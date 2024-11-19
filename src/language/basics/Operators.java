package language.basics;

public class Operators {
	
	// DataType Variable = Data;
	
	//Operators ==> Special Chars used to perform specific Operation in Programming
	
//	1. Arithmetic Operators
//	2. Assignment Operators
//	3. Conditional Operators
//	4. Logical Operators
//	5. Ternary Operator

	public static void main(String[] args) {

//		1. Arithmetic Operators  ==> to perform mathematical operations ( + , -, * , / , % (modulus) , ++ (increment), --(decrement))
		System.out.println("*******Arithmetic Operators******");
		
		int a = 11;
		int b = 2;
		System.out.println(a%b); //reminder
		
		// ++ ==> +1 ==> ex: a++ ==> a = a+1;
		//-- ==> -1 ==> ex: b-- ==> b = b-1
		
		//pre-increment (++a)  ==> increase the value first and execute the statement
		System.out.println(++a);
		System.out.println(a);
		
		//post-increment(b++) ==> execute the statement first and increase the value
		System.out.println(b++);
		System.out.println(b);
		
		//pre-decrement(--a)
		System.out.println(--a);
		
		//post-decrement(b--)
		System.out.println(b--);
		
		
//		2. Assignment Operators ==> to assign value to variable  (=, +=, -=, *=, /=, %=)
		System.out.println("*******Assignment Operators******");
		int c = 10;
		
		c+=5; //c=c+5;
		System.out.println(c);
		c-=3;
		System.out.println(c);
		c%=3;
		System.out.println(c);
		
		
//		3. Conditional Operators ==> to compare primitive data types (==, !=, > , < , >=, <=)
		System.out.println("*******Conditional Operators******");
		int d = 10;
		int e = 20;
		
		System.out.println(d==e);
		System.out.println(d>e);
		System.out.println(d<e);
		
		
//		4. Logical Operators ==> will be used to build logics ==> && (and)  , || (or) , ! (not)
		
		int x = 10;
		int y = 20;
		int z = 10;
		
		System.out.println(x>y && x==z); //false and true ==> false
		
		System.out.println(x>y || x==z);//false or true ==> true
		
		System.out.println(!(x>y || x==z));//not (false or true )==> not true ==> false
		
//		5. Ternary Operator  ==> short form of conditional statements  ==> ?
		
//		(condition) ? true : false
		
		int i = 10;
		int j = 20; 
		
		int max = (i > j ) ? i : j ;		
		System.out.println(max);
		
		String output = (i > j ) ? "10 is Max Value" : "20 is Max Value" ;
		System.out.println(output);
		
		
		
	}

}
