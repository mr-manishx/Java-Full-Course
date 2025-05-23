package ai.indxo;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args1) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int uniqueAns = findUniqueElement(arr);
		System.out.println(uniqueAns);
		
		sc.close();
		
	}

	private static int findUniqueElement(int[] arr) {
		// TODO Auto-generated method stub
		 
		int ans = 0;
		
		for(int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		
		return ans;
	}

}
