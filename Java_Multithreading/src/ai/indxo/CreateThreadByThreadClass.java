package ai.indxo;

public class CreateThreadByThreadClass extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Thread task");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThreadByThreadClass t = new CreateThreadByThreadClass();
		t.start();
	} 

}
