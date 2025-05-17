package ai.indxo;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Rest line of code");
	}

}
