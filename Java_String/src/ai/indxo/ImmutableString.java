package ai.indxo;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sachin";
		str.concat(" Tendulkar");;//concat() method appends the string at the end  
		System.out.println(str); //will print Sachin because strings are immutable objects
		
		String s = "Abhishek";
		s = s.concat(" Sharma");
		System.out.println(s); // Abhishek Sharma

	}

}
