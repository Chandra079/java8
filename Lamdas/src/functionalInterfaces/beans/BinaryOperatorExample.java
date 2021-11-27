package functionalInterfaces.beans;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<String> binaryOperator= (s1,s2)->s1.concat(s2);
		
		
		System.out.println(binaryOperator.apply("Chandra", "Sheker"));
		
		Comparator<Integer> comparator = (a,b)-> a.compareTo(b);
		
		BinaryOperator<Integer> maxBy= BinaryOperator.maxBy(comparator);
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		
		
		
		System.out.println("Max : "+maxBy.apply(10, 20));
		System.out.println("Min : "+minBy.apply(10, 20));
	}

}
