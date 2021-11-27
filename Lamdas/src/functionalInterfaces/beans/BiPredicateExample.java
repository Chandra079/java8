package functionalInterfaces.beans;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		
		// instructor who teaches online
		Predicate<Instructor> p1 = i1->i1.isOnline();
		//instrructor exp is >=5
		Predicate<Instructor> p2 = i1->i1.getExp()>=5;
		
		//Bipredicate 
		BiPredicate<Boolean, Float> biPredicate =(online,exp)-> online==true && exp >=5;
		
		
		//biconsumer prints name and skill
		BiConsumer<String, String> biConsumer = (s1,s2)->{
			System.out.println(s1 +" "+s2);
		};
		
		List<Instructor> instructors = Instructors.getAll();
		
		
		instructors.forEach(instructor-> {
			if(p1.and(p2).test(instructor)) {
				biConsumer.accept(instructor.getName(),	instructor.getSkill());
			}
		});
		System.out.println("--------------------");
		
		instructors.forEach(instructor->{
			BiPredicate<Boolean, Float> biPredicate2 =(online,exp)->online==true && exp>3;
			if(biPredicate2.test(instructor.isOnline(), instructor.getExp())) {
				System.out.println(instructor);
			}
		});
	
	}

}
