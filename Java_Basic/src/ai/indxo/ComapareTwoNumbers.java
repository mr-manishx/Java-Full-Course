package ai.indxo;

import java.util.Scanner;

public class ComapareTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		System.out.println(first != second);
		System.out.println(first < second);
		System.out.println(first <= second);
		
		sc.close();
	}
	

}
