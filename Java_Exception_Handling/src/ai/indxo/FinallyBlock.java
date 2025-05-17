package ai.indxo;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int result = 10 / 5;
			System.out.println(result);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block is always excuted even exception will occured or not");
		}
		System.out.println("Rest of code");
	}

}
