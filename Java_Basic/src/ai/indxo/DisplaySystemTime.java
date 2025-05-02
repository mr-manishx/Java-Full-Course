package ai.indxo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplaySystemTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.format("Current Date time: %tc%n", System.currentTimeMillis());
		
		System.out.println("\n 12 hour fomate date and time");
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a MMM dd yyyy");
		System.out.println("Current date time: "+now.format(formatter));
		
		
	}

}
