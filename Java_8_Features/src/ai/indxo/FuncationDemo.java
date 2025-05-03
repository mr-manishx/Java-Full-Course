package ai.indxo;

import java.util.function.Function;

public class FuncationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f = (name) -> name.length();
		
		System.out.println(f.apply("Manish"));
		System.out.println(f.apply("Rithika"));
		System.out.println(f.apply("Meera"));
	}

}
