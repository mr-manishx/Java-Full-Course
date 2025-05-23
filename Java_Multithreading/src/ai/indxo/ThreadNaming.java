package ai.indxo;


class Test extends Thread{
	
	@Override
	public void run() {
		System.out.println("run method() :)");
		System.out.println("run method thread name (:- "+currentThread().getName());
		
		Thread.currentThread().setName("runThread-100");
		System.out.println("New thread name: "+Thread.currentThread().getName());
		
	}
}
public class ThreadNaming {

	public static void main(String[] args) {
		
		// current thread main
		
		System.out.println("Hello main() method");
		
		// get name of current thread
		System.out.println("Current thread name: "+Thread.currentThread().getName());
		
		// set the name of current thread
		Thread.currentThread().setName("myThread");
		System.out.println("New thread name (: "+Thread.currentThread().getName());
		
		
		// create a object or Test class
		
		Test t = new Test();
//		t.setName("runMethodThread");
		t.start();
		
		Test t2 = new Test();
		t2.start();
	}
}
