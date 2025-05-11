package ai.indxo;

import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = {"Not Divisible", "Divisible"};
		System.out.println(str[(n % 3 == 0)? 1: 0]);
		
		sc.close();

	}

}
