package ai.indxo;

public class UserDefinePredefineMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		         // predefine method
		int temp = Math.max(12, 4);
		
		findEvenOrOdd(temp);

	}

	private static void findEvenOrOdd(int temp) {
		// TODO Auto-generated method stub
		
		if(temp % 2 == 0) {
			System.out.println("Even: "+temp);
		}
		else {
			System.out.println("Odd: "+temp);
		}
		
	}

}
