package ai.indxo;

import java.util.Scanner;

public class PolygonArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n-side polygon:");
		int n = sc.nextInt();
		
		System.out.println("Enter the length of a side:");
		int s = sc.nextInt();
		
		double ans = (n*Math.pow(s, 2)/(4*Math.tan(Math.PI/n)));
		System.out.print("Polygon area: "+ans);
		
		sc.close();
	}

}
