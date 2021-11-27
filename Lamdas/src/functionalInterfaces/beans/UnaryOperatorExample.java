package functionalInterfaces.beans;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary = i->i*10;
		
		System.out.println(unary.apply(10));
		
		Function<Integer, Integer> function = i->i*100;
		System.out.println(function.apply(10));
		
		IntUnaryOperator intUnaryOperator = i->100*i;
		System.out.println(intUnaryOperator.applyAsInt(8));
		
		
	}

}
