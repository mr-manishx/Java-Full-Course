package ai.indxo;

public class FinallyBlock3 {

	public static void main(String[] args) {

		try {
			System.out.println("Inside the try block");
			// The below code throws a divide by zero exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception can only accept a Null Pointer type
		// exception
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// executes regardless of exception occurred or not
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
