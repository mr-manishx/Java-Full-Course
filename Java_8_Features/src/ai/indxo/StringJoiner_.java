package ai.indxo;

import java.util.StringJoiner;

public class StringJoiner_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sj1 = new StringJoiner("-");	
		sj1.add("indxo");
		sj1.add("ai");
		sj1.add("java");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner("-", "(", ")");	
		sj2.add("indxo");
		sj2.add("ai");
		sj2.add("java");
		System.out.println(sj2);

	}

}
