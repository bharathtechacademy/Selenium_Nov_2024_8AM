package language.basics;

import java.util.HashSet;
import java.util.Set;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			System.out.println(i + ". Bharath");
		}
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Anusha");
		empNamesHashSet.add("Kiran");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Mansi");
		empNamesHashSet.add("Dileep");
		empNamesHashSet.add("Anusha");
		empNamesHashSet.add(null);
	
		for (String emp :empNamesHashSet) {
			System.out.println(emp);
		}

	}

}
