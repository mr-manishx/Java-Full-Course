package ai.indxo;


class MultipleTaskMultipleThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Multiple task multiple thread1");
	}
}
class MultipleTaskMultipleThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Multiple task multiple thread2");
	}
}
class MultipleTaskMultipleThread3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Multiple task multiple thread3");
	}
}
public class MultipleTaskMultipleThread_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleTaskMultipleThread1 th = new MultipleTaskMultipleThread1();
		
		Thread thread1 = new Thread(th);
		thread1.start();
		
		MultipleTaskMultipleThread1 th2 = new MultipleTaskMultipleThread1();
		
		Thread thread2 = new Thread(th2);
		thread2.start();
		
		MultipleTaskMultipleThread1 th3 = new MultipleTaskMultipleThread1();
		
		Thread thread3 = new Thread(th3);
		thread3.start();
	}

}
