package functionalInterfaces.beans;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Double> sqrt = i->Math.sqrt(i);
		
		
		System.out.println("Square Root of :" +sqrt.apply(16));
		System.out.println("Square Root of :" +sqrt.apply(64));
		
		Function<String, String> lowerCaseFunction =s1->s1.toLowerCase();
		
		System.out.println("Lower Case of : "+lowerCaseFunction.apply("CHANDRA"));
		
		Function<String, String> concat = s1->s1.concat("Sheker");
		
		
		//It will apply lower case on Chandra first then it will apply andThen
		System.out.println(lowerCaseFunction.andThen(concat).apply("CHANDRA"));
		
		// It will compose lowerCase and Concat then it will apply LowerCase Function
		System.out.println(lowerCaseFunction.compose(concat).apply("CHANDRA"));
		
	}

}
