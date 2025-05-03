package ai.indxo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = i -> i > 10;
		
		boolean ans = p.test(5);
		System.out.println(ans);
		
		System.out.println(p.test(11));
		
		System.out.println("------------------------");
		
		String[] names = {"Anushka", "Anjali", "Deepika", "Kajol", "Meera", "Rithika"};
		
		Predicate<String> pd = name -> name.charAt(0) == 'A';
		for(String name : names) {
			if(pd.test(name)) {
				System.out.println(name);
			}
		}

	}

}
