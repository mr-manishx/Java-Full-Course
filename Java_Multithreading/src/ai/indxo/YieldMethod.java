package ai.indxo;

class YieldDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.yield();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	
}
public class YieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread td = new Thread(new YieldDemo());
		td.start();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}

}
