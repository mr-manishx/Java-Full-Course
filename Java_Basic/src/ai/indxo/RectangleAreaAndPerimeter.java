package ai.indxo;

import java.util.Scanner;

public class RectangleAreaAndPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int area = l*b;
		int perimeter = 2*l + 2*b;
		
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Perimeter of Rectangle: "+perimeter);
		
		sc.close();
	}

}
