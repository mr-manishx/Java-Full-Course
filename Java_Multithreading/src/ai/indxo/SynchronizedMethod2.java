package ai.indxo;


class TicketBook_Demo{

	int total_seats = 10;

	// synchronized to prevent race conditions
	synchronized void bookSeats(int seats) {
		if (total_seats >= seats) {
			System.out.println(Thread.currentThread().getName() + ": Ticket booked successfully for " + seats + " seats.");
			total_seats -= seats;
			System.out.println("Remaining seats: " + total_seats);
		} else {
			System.out.println(Thread.currentThread().getName() + ": Cannot book " + seats + " seats. Only " + total_seats + " left.");
		}
	}
}

class MovieBookApp implements Runnable {
	TicketBook_Demo b;
	int seats;

	public MovieBookApp(TicketBook_Demo b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	@Override
	public void run() {
		b.bookSeats(seats);
	}
}

public class SynchronizedMethod2 {

	public static void main(String[] args) {
		TicketBook_Demo b = new TicketBook_Demo();

		MovieBookApp user1 = new MovieBookApp(b, 7);
		MovieBookApp user2 = new MovieBookApp(b, 4);

		Thread t1 = new Thread(user1, "User1");
		Thread t2 = new Thread(user2, "User2");

		t1.start();
		t2.start();
	}
}
