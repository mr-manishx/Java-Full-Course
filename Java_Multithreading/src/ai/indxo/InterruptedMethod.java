package ai.indxo;

class Test_Interrupt implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("sleep interrupted: "+e);
		}
	}
	
}
public class InterruptedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread td = new Thread(new Test_Interrupt());
		td.start();
		
		td.interrupt();
	}

}
