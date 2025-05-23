package ai.indxo;


class InterruptedDemo implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println("A: "+Thread.interrupted()); // true -> false
//		System.out.println("A1: "+Thread.interrupted());
		
		System.out.println("1: "+Thread.currentThread().isInterrupted()); // true -> true
		System.out.println("1: "+Thread.currentThread().isInterrupted());
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println("B: "+Thread.interrupted());
			}
		}
		catch(Exception e) {
			System.out.println("Thread interrupt: "+e);
		}
	}
	
}
public class InterruptedAndisInterruptedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread td = new Thread(new InterruptedDemo());
		td.start();
		
		td.interrupt();
	}

}
