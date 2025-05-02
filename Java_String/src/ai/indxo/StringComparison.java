package ai.indxo;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		System.out.println("\n------------------\n");

		String st1 = "Ram";
		String st2 = "rAm";
		// Using equals() method for case-sensitive comparison
		boolean equalsResult = st1.equals(st2);
		System.out.println("Using equals() method: " + equalsResult); // Output: false
		// Using equalsIgnoreCase() method for case-insensitive comparison
		boolean equalsIgnoreCaseResult = st1.equalsIgnoreCase(st2);
		System.out.println("Using equalsIgnoreCase() method: " + equalsIgnoreCaseResult); // Output: true

	}

}
