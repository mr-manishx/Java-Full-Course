package ai.indxo;

import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value b: ");
		int b = sc.nextInt();
		
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println("a: "+a+" b: "+b);
//		
		System.out.println();
		
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a: "+a+" b: "+b);
		
		
		sc.close();
		
		
	}

}
