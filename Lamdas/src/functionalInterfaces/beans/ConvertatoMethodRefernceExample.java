package functionalInterfaces.beans;

import java.util.List;
import java.util.function.Predicate;

public class ConvertatoMethodRefernceExample {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();


		Predicate<Instructor> predicateExp = instructor -> instructor.getExp()>4;
		Predicate<Instructor> predicateExp1 = ConvertatoMethodRefernceExample::greateThanFourYears;
		Predicate<Instructor> predicateOnline = ConvertatoMethodRefernceExample::isOnline;
		
		instructors.forEach(instructor->{
			if(predicateExp1.test(instructor))
				System.out.println(instructor);
		});
		System.out.println("---------");
		instructors.forEach(instructor->{
			if(predicateExp1.or(predicateOnline).test(instructor))
				System.out.println(instructor);
		});
	}

	public static boolean greateThanFourYears(Instructor in) {
		if(in.getExp()>=4)
			return true;
		return false;
	}
	
	public static boolean isOnline(Instructor in) {
		if(in.isOnline())
			return true;
		return false;
	}
}
