package functionalInterfaces.beans;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> supplier =()->Math.random()*100;
		
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}

}
