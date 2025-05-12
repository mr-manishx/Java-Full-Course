package ai.indxo;

import java.util.ArrayList;
import java.util.List;

public class FilterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		names.add("Anushka");
		names.add("Rithika");
		names.add("Sanju");
		names.add("Anupma");
		names.add("Anjali");
		names.add("Meera");
		
		names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
	}
}
		
