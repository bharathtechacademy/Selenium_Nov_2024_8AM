package language.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsConcepts {
	
	//Challenges with Array
//	1. Fixed Length
//	2. Memory allocation at the begining /Static memory allocation
//	3. similar data types
//	4. modifications not allowed
	
	
	
	//Collections
	
//	Hash ==> random
//	Link ==> Insertion
//	Tree ==> Ascending
	
	//List ==> ArrayList, LinkedList  (order of values or storing null values makes the difference or memory allocation)
//		1. List can store multiple values with similar data types together
//		2. List can store duplicate values
//		3. List can follow dynamic memory allocation
//		4. List can allow modifications
		
	//2. Set  ==> HashSet, LinkedHashSet, TreeSet
//		1. Set can store multiple values with similar data types together
//		2. Set cannot store duplicate values
//		3. Set can follow dynamic memory allocation
//		4. Set can allow modifications	
	
	//3. Map  ==> HashMap, LinkedHashMap, TreeMap, Hashtable
//		1. Map can store multiple datatypes together in the form of Key and Values
//		2. Map can store duplicate values but, duplicate keys are not allowed
//		3. Map can follow dynamic memory allocation
//		4. Map can allow modifications

	public static void main(String[] args) {
		
		String emp1Name ="Anusha";
		int emp1Id = 1234;
		
		String emp2Name = "kiran";
		int emp2Id = 1235;
		
		String emp3Name = "Bharath";
		int emp3Id = 1236;
		
		String [] empNames = new String [3];
		empNames[0]="Anusha";
		empNames[1]="Kiran";
		
		
		int [] empIds = new int [3];
		empIds[0]=1234;
		empIds[1]=1235;
		empIds[2]=1236;
		
		/*********************ArrayList*************************/
		System.out.println("*********************ArrayList*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Anusha");
		empNamesArrayList.add("Kiran");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Mansi");
		empNamesArrayList.add("Dileep");
		empNamesArrayList.add("Anusha");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Bharath");
		empNamesArrayList.add(2,"Akshay");
		System.out.println(empNamesArrayList.size());
		System.out.println(empNamesArrayList);
		System.out.println(empNamesArrayList.get(2));
		
		/*********************LinkedList*************************/
		System.out.println("*********************LinkedList*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Anusha");
		empNamesLinkedList.add("Kiran");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Mansi");
		empNamesLinkedList.add("Dileep");
		empNamesLinkedList.add("Anusha");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("Bharath");
		empNamesLinkedList.add(2,"Akshay");
		System.out.println(empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);
		
		/*********************HashSet*************************/
		System.out.println("*********************HashSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//Null Values : Allowed
		//Order of Storing Values: Random
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Anusha");
		empNamesHashSet.add("Kiran");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Mansi");
		empNamesHashSet.add("Dileep");
		empNamesHashSet.add("Anusha");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Bharath");		
		System.out.println(empNamesHashSet.size());
		System.out.println(empNamesHashSet);
		
		/*********************LinkedHashSet*************************/
		System.out.println("*********************LinkedHashSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//Null Values : Allowed
		//Order of Storing Values: Insertion Order
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Anusha");
		empNamesLinkedHashSet.add("Kiran");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Mansi");
		empNamesLinkedHashSet.add("Dileep");
		empNamesLinkedHashSet.add("Anusha");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Bharath");		
		System.out.println(empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		/*********************TreeSet*************************/
		System.out.println("*********************TreeSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//Null Values : Not Allowed
		//Order of Storing Values: Ascending Order
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Anusha");
		empNamesTreeSet.add("Kiran");
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("Mansi");
		empNamesTreeSet.add("Dileep");
		empNamesTreeSet.add("Anusha");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Bharath");		
		System.out.println(empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);

	}

}
