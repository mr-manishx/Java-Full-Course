package ai.indxo;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check given number is even or odd?");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		sc.close();
	}

}
