package ai.indxo;

import java.util.Scanner;

public class HexagonArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		
		double ans = (6*Math.pow(side, 2)/(4*Math.tan(Math.PI/6)));
		System.out.println("Hexagon area: "+ans);
		
		sc.close();
	}

}
