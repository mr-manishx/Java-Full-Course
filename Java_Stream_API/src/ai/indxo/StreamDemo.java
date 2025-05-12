package ai.indxo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// approach-1
		Stream<Integer> stream = Stream.of(32, 4, 21, 56, 8, 44);
		
		stream.filter(i -> i > 20).forEach(i -> System.out.println(i));
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Martin");
		names.add("Rithika");
		names.add("Meera");
		
		// approach-2
		Stream<String> stream2 = names.stream();
		stream2.forEach(i -> System.out.print(i+" "));
		
		System.out.println();
		
		List<Integer> list = Arrays.asList(12, 3, 54, 35, 7, 53);
		Stream<Integer> newStream = list.stream();
		Stream<Integer>filteredStream = newStream.filter(i -> i % 2 == 0);
		filteredStream.forEach(i -> System.out.println(i));
		

	}

}
