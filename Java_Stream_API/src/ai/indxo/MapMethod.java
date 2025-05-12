package ai.indxo;

import java.util.Arrays;
import java.util.List;


public class MapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> country = Arrays.asList("india", "usa", "japan", "england", "nepal", "rusia");
		country.stream().map(mp -> mp.toUpperCase()).forEach(id -> System.out.println(id));
		
		country.stream().mapToInt(name -> name.length()).forEach(idx -> System.out.println(idx));
		
		List<String> names = Arrays.asList("Anuj", "Rani", "Akash", "Meera", "Sanju", "Anjali");
		
		names.stream().filter(name -> name.startsWith("A"))
		.map(name -> name+ "-"+name.length()).forEach(idx -> System.out.println(idx));;
		
		
	}

}
