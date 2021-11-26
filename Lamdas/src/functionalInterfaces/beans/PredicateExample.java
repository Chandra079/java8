package functionalInterfaces.beans;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> predicate =i->i>10;
		System.out.println(predicate.test(2));
		
		System.out.println("--------------	");
		//i>10 && i is even Number
		
		Predicate<Integer> predicate1 =i -> (i%2==0 && i>10);
		System.out.println(predicate1.test(450));
		
		//i>10 and i is even 
		Predicate<Integer> predicate2 = i->i%2==0;
		System.out.println(predicate.and(predicate2).test(24));
		
		// i >10 or i is even
		System.out.println(predicate.or(predicate2).test(4));
		
		//i>10 && i%2!=0
		
		System.out.println(predicate.and(predicate2).negate().test(33));
	}

}
