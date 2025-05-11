package ai.indxo;

import java.util.Optional;
import java.util.Scanner;

public class Optional_GetMassegeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id..");
		int id = sc.nextInt();
		
		Optional_User user = new Optional_User();
		
//		String userName = user.getUserNameById(id);
//		
//		String msg = userName.toUpperCase()+" Hello";
//		
//		System.out.println(msg);
//		
//		System.out.println("-------------------");
		
		Optional<String> username = user.getUserNameByIdOptiona(id);
		
		if(username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase()+" Hello kya hal hai");
		}
		else {
			System.out.println("Data Not found..");
		}
		
		sc.close();
		
		
	}

}
