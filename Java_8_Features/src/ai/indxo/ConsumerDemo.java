package ai.indxo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c = (name) -> System.out.println(name+", Good Morning");
		
		c.accept("Raaz");
		c.accept("Rithika");
		
		List<Integer> ar = Arrays.asList(10, 20, 30, 42, 23);
		ar.forEach(idx -> System.out.print(idx+" "));
	}

}
