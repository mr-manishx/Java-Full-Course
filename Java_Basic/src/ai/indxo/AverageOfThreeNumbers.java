package ai.indxo;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println("Average of three numbers: "+(x+y+z)/3);
		sc.close();
	}

}
