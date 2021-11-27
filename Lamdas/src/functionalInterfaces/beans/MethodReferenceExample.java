package functionalInterfaces.beans;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
@FunctionalInterface
interface InterfaceExample{
	public String getName(String name);
	
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		Predicate<Instructor> predicate = i->i.isOnline();
		Predicate<Instructor> predicate1 = Instructor::isOnline;
		
		
		Function<Integer, Double> function1 = n->Math.sqrt(n);
		Function<Integer, Double> function2 = Math::sqrt;
		
		Function<String, String> lowerCaseFunction = String::toLowerCase;
		
		
		BinaryOperator<String> binary = String::concat;
		System.out.println(binary.apply("Java", "Programming"));
		
		InterfaceExample interfaceExample = (name)-> name.concat("Sheker");
		System.out.println(interfaceExample.getName("Chandra"));
		
	}

}
