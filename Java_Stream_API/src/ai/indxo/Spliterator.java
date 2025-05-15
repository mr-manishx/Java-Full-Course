package ai.indxo;

import java.util.Arrays;
import java.util.List;

public class Spliterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Java", "Spring", "DSA", "Docker");
		java.util.Spliterator<String> spliterator = list.stream().spliterator();
		spliterator.forEachRemaining(l -> System.out.println(l));

	}

}
