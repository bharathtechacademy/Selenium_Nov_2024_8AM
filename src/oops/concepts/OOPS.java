package oops.concepts;

public class OOPS {
	
	OOPS() {

	}

	OOPS(String params) {

	}
	
	// OOP'S ==> Object Oriented Programming Concepts
	
	// Class ==> Class is template or Prototype that we can use to store Data, Methods and Objects together at same memory location.
	
	// Object ==> New Instance of the class (New Copy of the Class)
		
	// Constructor ==> Constructor is a default method created by Java when we create new Class.We Can use constructor to create instance of class and initialize the properties.
	
	// Method ==> Collection of Statements / Block of code to perform specific task.	
	// (Method with return type , without return type (void), with parameters (if any data changing), without parameters, constructor method )
		
	// Inheritance ==> Extending / Inheriting properties of parent class into child class without creating object. (extends)
	// Multiple Inheritance is not possible (class1 extends class2, class3)
	// Multi-Level Inheritance is Possible (class1 extends class2 , class2 extends class3)
	// Hierarchical Inheritance is possible(class1 extends class2, class3 extends class2, class4 extends class2)
	
	// Abstraction ==> Abstraction is the concept of hiding the implementation. (abstract and extends)
	
	// Interface ==> It's a 100% abstract class before Java 8.  (implements)
	// In Java 8 we started allowing default and static methods as well and java 9 we started allowing concrete methods with private
	
	// Encapsulation ==> Encapsulation is the concept of hiding the information. (private)
	
	// Polymorphism (Overloading / Overriding) ==> One Method with different implementations.
	
	// Static ==> Can make any property as global property

	public static void main(String[] args) {
		
		OOPS obj = new OOPS(); //Object
		
	}

}
