package ai.indxo;


class SingleTaskMultipleThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Single task multiple thread");
	}
	
}
public class SingleTaskMultipleThread_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTaskMultipleThread st = new SingleTaskMultipleThread();
		
		Thread td1 = new Thread(st);
		td1.start();
		
		Thread td2 = new Thread(st);
		td2.start();
	}

}
