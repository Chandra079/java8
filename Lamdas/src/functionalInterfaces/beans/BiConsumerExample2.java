package functionalInterfaces.beans;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

	public static void main(String[] args) {
		List<Instructor> instructors = Arrays.asList(new Instructor("Mike", "java", 3.4f,false),
				new Instructor("John", "C", 4,true), new Instructor("Riche", "Spring", 3,true), new Instructor("Chandra", "SpringBoot", 5,true));
		BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println("Name : " + s1 + " And skill : " + s2);

		instructors.forEach(instructor -> {
			biConsumer.accept(instructor.getName(), instructor.getSkill());
		});

	}

}
