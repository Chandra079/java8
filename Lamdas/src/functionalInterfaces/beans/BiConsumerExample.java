package functionalInterfaces.beans;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		String result1;
			
		BiConsumer<String, String> biConsumer =(s1,s2)->{
			String result=null;
			result = s1.concat(s2);
			System.out.println(result);
			System.out.println("result.hashCode() : "+result.hashCode());
			System.out.println("s1 haschcode : "+s1.hashCode());
			System.out.println("s2 haschcode : "+s2.hashCode());
		};
		
		biConsumer.accept("Chandra", "Sheker");
		
	}

}
