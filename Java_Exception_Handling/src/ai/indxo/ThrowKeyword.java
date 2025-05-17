package ai.indxo;

public class ThrowKeyword {
	
	public static void validate(int age) {
		if(age < 18) {
			throw new ArithmeticException("Person not eligible for vote");
		}
		else {
			System.out.println("Welcome to voting app...");
		}
	}

	public static void main(String[] args) {
		
		validate(19);
		System.out.println("Rest of code");
	}
}
