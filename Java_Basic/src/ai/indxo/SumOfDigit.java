package ai.indxo;

import java.util.Scanner;

public class SumOfDigit {
	
	static int sumOfdigit_(int digit) {
		
		int sum = 0;
		while(digit != 0) {
			int remain = digit % 10;
			sum = sum + remain;
			digit = digit / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some digit:");
		int digit = sc.nextInt();
		
		int ans = sumOfdigit_(digit);
		System.out.println("Digit sum: "+ans);
		
		sc.close();
	}

}
