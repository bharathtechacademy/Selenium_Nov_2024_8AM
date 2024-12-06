package language.basics;

public class ArrayConcepts {
	
	//Array Can Store Multiple Values With Same Data Type Together at Same Location

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
		empNames[2]="Bharath";
		
		int [] empIds = new int [3];
		empIds[0]=1234;
		empIds[1]=1235;
		empIds[2]=1236;
		
		System.out.println(empNames[1]);
		System.out.println(empIds[1]);
		
		String [][] empGroups = new String [2][3];
		
		empGroups[0][0]="Anusha";
		empGroups[0][1]="Bhargavi";
				
		empGroups[1][2]="Mansi";
		System.out.println(empGroups.length);
		
		
		

	}

}
