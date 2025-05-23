package ai.indxo;


class HiringProcess_FristRound implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("First round coding assessment");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("First round successfully completed");
		
	}
	
}
class HiringProcess_SecondRound implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Second round interview...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Second round interview cleared..");
	}
}
class HiringProcess_Offerlatter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Offer latter...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Onboarding start...");
	}
	
}
public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread fr = new Thread(new HiringProcess_FristRound());
		fr.start();
		
		fr.join();
		 
		Thread sr = new Thread(new HiringProcess_SecondRound());
		sr.start();
		
		sr.join();
		
		Thread ol = new Thread(new HiringProcess_Offerlatter());
		ol.start();
	}

}
