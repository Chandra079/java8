package streams.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollections {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>(Arrays.asList("Richie","John","Chandra","sheker"));
		System.out.println(names);
		names.remove("Chandra");
		System.out.println(names);
		
		
		Stream<String> nameStream = Stream.of(new String[] {"Richie","John","Chandra","sheker"});	
		System.out.println(nameStream);
	}

}
