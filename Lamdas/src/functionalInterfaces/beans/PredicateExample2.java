package functionalInterfaces.beans;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {

		List<Instructor> instructors = Instructors.getAll();

		// instructor teaches Online

		Predicate<Instructor> ponline = instructor -> instructor.isOnline();
		Predicate<Instructor> predicateExp = instructor -> instructor.getExp()>4;
		// instructor teaches Online
		instructors.forEach(instructor -> {
			if (ponline.test(instructor))
				System.out.println(instructor);
		});
		
		
		System.out.println("-------------------");
		// instructor teaches Online and Exp is greater 4 years 
		instructors.forEach(instructor -> {
			if (ponline.and(predicateExp).test(instructor))
				System.out.println(instructor);
		});
	}

}
