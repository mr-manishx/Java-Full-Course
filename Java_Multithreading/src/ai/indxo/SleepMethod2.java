package ai.indxo;

class SleepMethodDemo extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
//				Thread.sleep(1000, -1);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class SleepMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SleepMethodDemo td = new SleepMethodDemo();
	
		td.start();
		
	}

}
