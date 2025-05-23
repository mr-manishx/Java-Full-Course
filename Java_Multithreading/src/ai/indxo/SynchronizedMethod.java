package ai.indxo;

class TicketBook {

	int total_seats = 10;

	void bookSeats(int seats) {

		if (total_seats >= seats) {
			System.out.println("Ticket booked successfully..");
			total_seats = total_seats - seats;
			System.out.println("Total left seats: " + total_seats);
		} else {
			System.out.println(seats + " you cannot book!");
			System.out.println("Total left seats: " + total_seats);
		}
	}
}

public class SynchronizedMethod extends Thread{
	
	static TicketBook b;
	int seats;

	public void run() {
		
		b.bookSeats(seats); 
		
	}
	public static void main(String[] args) {
		
		b = new TicketBook();
		SynchronizedMethod p1 = new SynchronizedMethod();
		p1.seats = 7;
		p1.start();
		
		SynchronizedMethod p2 = new SynchronizedMethod();
		p2.seats = 5;
		p2.start();
		
	}

}
