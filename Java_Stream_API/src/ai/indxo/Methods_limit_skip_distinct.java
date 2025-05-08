package ai.indxo;

import java.util.Arrays;
import java.util.List;

public class Methods_limit_skip_distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> javacourse = Arrays.asList("corejava", "advjava", "springboot", "microservice", "docker");
		
		javacourse.stream().limit(3).forEach(c -> System.out.println(c+" "));
		
		System.out.println("--------------------------");
		
	    javacourse.stream().skip(3).forEach(c -> System.out.println(c+" "));
	    
	    System.out.println("---------------------------");
	    
	    List<String> names = Arrays.asList("rani", "raja", "rani", "guru", "raja");
	    names.stream().distinct().forEach(i -> System.out.println(i));

	}

}
