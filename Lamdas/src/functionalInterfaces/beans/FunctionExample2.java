package functionalInterfaces.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
	public static void main(String[] args) {

		// Map of Instructors with name as key and expe as value
		// create Function which will take List<Instructor> as input then return Map.

		List<Instructor> instructors = Instructors.getAll();
		Map<String, Float> instructorsMap = new HashMap<String, Float>();

		Function<List<Instructor>, Map<String, Float>> function1 = instructorss -> {
			instructorss.forEach(i -> {
				instructorsMap.put(i.getName(), i.getExp());
			});

			return instructorsMap;
		};

		Map<String, Float> apply = function1.apply(instructors);

		System.out.println(function1.apply(instructors));

		System.out.println("---------------");
		// Create Map with name and Exp and Who teaches online
		// Predicate to test OnlineCourse
		Predicate<Instructor> onlinePredicate = instructor -> instructor.isOnline();

		Function<List<Instructor>, Map<String, Float>> function2 = listOfinstructors -> {
			Map<String, Float> map = new HashMap<String, Float>();
			
			listOfinstructors.forEach(i -> {
				if (onlinePredicate.test(i)) {
					map.put(i.getName(), i.getExp());
				}
			});

			return map;
		};
		System.out.println(function2.apply(instructors));
		

	}
}
