package ai.indxo;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int index = 10; // Accessing an index that is out of bounds 
		
		try {
			int value = arr[index];
			System.out.println("Value at "+index+" is "+value);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Error: index out of bound");
		}

	}

}
