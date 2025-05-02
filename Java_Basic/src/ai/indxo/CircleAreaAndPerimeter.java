package ai.indxo;

import java.util.Scanner;

public class CircleAreaAndPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Area of Circle: "+Math.PI*Math.pow(r, 2));
		System.out.println("Perimeter of Circle: "+2*Math.PI*r);
		sc.close();
	}

}
