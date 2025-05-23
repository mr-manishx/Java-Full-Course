package ai.indxo;

class PriorityDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("run()"+ " priority: "+Thread.currentThread().getPriority());
		
	}
}

public class PrioritiesThread {

	public static void main(String[] args) {
		
		System.out.println("old priority of main() : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("New priority of main() : "+Thread.currentThread().getPriority());
		
		
		PriorityDemo pt = new PriorityDemo();
		pt.setPriority(3);
		pt.start();
		
	}
}
