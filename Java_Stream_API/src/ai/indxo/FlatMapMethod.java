package ai.indxo;

import java.util.Arrays;
import java.util.List;

public class FlatMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> javacourse = Arrays.asList("core java", "adv java", "springboot");
		
		List<String> uicourse = Arrays.asList("html", "css", "js", "react");
		
		List<List<String>> course = Arrays.asList(javacourse, uicourse);
		
	    course.stream().forEach(c -> System.out.println(c));
	    
		course.stream().flatMap(c -> c.stream()).forEach(c -> System.out.println(c));

	}

}
