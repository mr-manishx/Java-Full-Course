package ai.indxo;

public class FinallyBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Inside the try block");
			// The below code throws a divide by zero exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// handles the Arithmetic Exception / Divide by zero exception
		catch (ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}
		// executes regardless of exception occurred or not
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("rest of the code...");

	}

}
