package ai.indxo;

public class CreateThreadByRunnableInterface implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateThreadByRunnableInterface t = new CreateThreadByRunnableInterface();
		Thread td = new Thread(t);
		td.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable task");
		
	}

}
