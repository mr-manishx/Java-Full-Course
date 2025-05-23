package ai.indxo;

class TicketBooking {

	int total_seats = 10;

	// synchronized to prevent race conditions
	void bookSeats(int seats) {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		// only synchronized block will be lock
		synchronized (this) {

			if (total_seats >= seats) {
				System.out.println(
						Thread.currentThread().getName() + ": Ticket booked successfully for " + seats + " seats.");
				total_seats -= seats;
				System.out.println("Remaining seats: " + total_seats);
			} else {
				System.out.println(Thread.currentThread().getName() + ": Cannot book " + seats + " seats. Only "
						+ total_seats + " left.");
			}

		}

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}

class MovieBookAppTest implements Runnable {
	TicketBooking b;
	int seats;

	public MovieBookAppTest(TicketBooking b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	@Override
	public void run() {
		b.bookSeats(seats);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		TicketBooking b = new TicketBooking();

		MovieBookAppTest user1 = new MovieBookAppTest(b, 7);
		MovieBookAppTest user2 = new MovieBookAppTest(b, 4);

		Thread t1 = new Thread(user1, "User1");
		Thread t2 = new Thread(user2, "User2");

		t1.start();
		t2.start();
	}
}
