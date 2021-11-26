package functionalInterfaces.beans;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	static List<Instructor> instructors=null;
	
	public static List<Instructor> getAll() {
		instructors = Arrays.asList(new Instructor("Mike", "java", 3.4f,false),
				new Instructor("John", "C", 4,true), new Instructor("Riche", "Spring", 3,true), new Instructor("Chandra", "SpringBoot", 5,true));
		return instructors;
	}

}
