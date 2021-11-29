package streams.bean;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import functionalInterfaces.beans.Instructor;
import functionalInterfaces.beans.Instructors;

public class StreamExample {

	public static void main(String[] args) {
		// Creating a map of names and courses who teaches online and have exp >=4
		
		Predicate<Instructor> p1=(ins)-> ins.isOnline();
		Predicate<Instructor> p2=(ins)-> ins.getExp()>=4;
		
		
		Function<Instructor, String> keyFunction =(i)->i.getName();
		//Function<Instructor, String> valueFunction =(i)->i.getSkill();
		List<Instructor> instructors = Instructors.getAll();
		
		Map<String, String> istructorsMap=null;
		
		istructorsMap = instructors.stream().filter(p1.and(p2))
				.collect(Collectors.toMap(keyFunction,  i->i.getSkill()));
		System.out.println(istructorsMap);
		for(Entry<String, String> entry: istructorsMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
