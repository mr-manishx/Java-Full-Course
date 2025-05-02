package ai.indxo;

public class StringMemoryAllotment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String literals - stored in the string pool
		String str1 = "Java";
		String str2 = "Java";
		// Checking if str1 and str2 point to the same object
		System.out.println("str1 == str2: " + (str1 == str2)); // true, because both refer to the same string literal in
																// the pool
		
		// Strings created with 'new' - stored in heap memory outside the string pool
		String str3 = new String("Java");
		String str4 = new String("Java");
		
		// Checking if str3 and str4 point to the same object
		
		System.out.println("str3 == str4: " + (str3 == str4)); // false, because 'new' creates a new object each time
		
		// Interning str3
		String str5 = str3.intern();
		// Checking if str1 and str5 point to the same object
		System.out.println("str1 == str5: " + (str1 == str5)); // true, str5 is interned, so it refers to the string in
																// the pool
		
		// Demonstrating the effect of interning on memory allocation
		String str6 = new String("Java").intern();
		// Checking if str6 is the same as str1
		System.out.println("str1 == str6: " + (str1 == str6)); // true, str6 is interned and points to the pooled
																// instance
	}

}
