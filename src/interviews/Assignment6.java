package interviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment6 {

	public static void main(String[] args) {

		String[] empNames = { "Alice Johnson", "Bob Smith" };

		List<Double> aliceData = new ArrayList<Double>();
		aliceData.add(75000.0);
		aliceData.add(5.0);
		aliceData.add(4.2);

		List<Double> bobData = new ArrayList<Double>();
		bobData.add(68000.0);
		bobData.add(3.0);
		bobData.add(3.8);

		Map<String, List<Double>> data = new HashMap<String, List<Double>>();

		data.put(empNames[0], aliceData);
		data.put(empNames[1], bobData);

		for (String emp : empNames) {
			double rating = data.get(emp).get(2);
			double exp = data.get(emp).get(1);
			double baseSalary = data.get(emp).get(0);
			double hike = 0;
			if (rating >= 4) {
				hike = (baseSalary * 0.15) + 1500;
				if (exp >= 5) {
					hike += 5000;
				}
			} else if (rating >= 3 && rating < 4) {
				hike = (baseSalary * 0.10) + 1200;
				if (exp >= 5) {
					hike += 5000;
				}
			}
			
			System.out.println("Hike of the emp "+emp+" is : "+hike);
		}

	}

}
