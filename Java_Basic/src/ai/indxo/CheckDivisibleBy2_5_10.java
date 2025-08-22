package ai.indxo;

import java.util.Scanner;

public class CheckDivisibleBy2_5_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%3==0 && number%10==0 && number%5==0) {
			System.out.println(number+" is disible by 3, 5 and 10");
		}
		else if(number%3==0 && number%5==0){
			System.out.println(number+" id divisibe by 3 and 5");
		}
		else if(number%5==0 && number%10==0) {
			System.out.println(number+" is divisible by 5 and 10");
		}
		else {
			System.out.println("number is not divisible");
		}
		sc.close();
		
	}

}
