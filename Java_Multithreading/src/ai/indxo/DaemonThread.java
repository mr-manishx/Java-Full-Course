package ai.indxo;

class Daemon extends Thread {
	
	@Override
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("run method is Daemon (- "+Thread.currentThread().isDaemon());
		}
		else {
			System.out.println("run method() is child method() of main method()");
		}
	}
} 
public class DaemonThread {

	public static void main(String[] args) {
		
		System.out.println("Hello parent thread main()");
		System.out.println("Main method() is Daemon :( "+Thread.currentThread().isDaemon());
		
//		Thread.currentThread().setDaemon(true);  // Exception IllegalThreadStackException
//		System.out.println(Thread.currentThread().isDaemon());
		
		
		Daemon t = new Daemon();
		t.setDaemon(true);  // set as Daemon thread
		t.setDaemon(false);
		t.start();
		
	}
}
