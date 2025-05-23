package ai.indxo;

class SingleTaskSingleThreadx implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Single task Single thread");
	}

}
class SingleTaskSingleThread{
	public static void main(String[] args) {
		
		SingleTaskSingleThreadx t = new SingleTaskSingleThreadx();
		Thread td = new Thread(t);
		td.start();
	}
}
