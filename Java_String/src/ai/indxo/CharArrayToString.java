package ai.indxo;

public class CharArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		// Construct a string from a subset of the char array  
        // Here, we start at index 6 (the space character) and use the next 5 characters  
		String str = new String(charArray, 6, 5);
		
		// output result
		System.out.println(str);
	}

}
