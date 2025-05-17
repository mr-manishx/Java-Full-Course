package ai.indxo;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int divident = 10;
		int divisor = 0;
		
		try {
			int result = divident / divisor;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Division by 0 not allowed");
			// additional error handling code can write
		}
	}

}
