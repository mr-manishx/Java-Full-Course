package ai.indxo;

import java.util.Scanner;

public class NullPointerExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string (type 'null' to simulate null input): ");

		String input = sc.nextLine();
		String str = input.equals("null") ? null : input;

		try {
			int length = str.length();
			System.out.println("Length of String: " + length);
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Error: Null reference occurred");
		} 
		finally {
			sc.close();
		}

	}

}
