package ai.indxo;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Input the latitude of coordinate 1: ");
		double lat1 = input.nextDouble();
		System.out.print("Input the longitude of coordinate 1: ");
		double lon1 = input.nextDouble();

		// Prompt the user to input the latitude and longitude of coordinate 2
		System.out.print("Input the latitude of coordinate 2: ");
		double lat2 = input.nextDouble();
		System.out.print("Input the longitude of coordinate 2: ");
		double lon2 = input.nextDouble();

		// Calculate and display the distance between the two coordinates
		System.out.print(
				"The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
		
		input.close();
	}

	private static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
		// points will be convert to radians before calculation
		
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);
		
		double radius = 6371.01;
		
		return radius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2));
		
	}

}
