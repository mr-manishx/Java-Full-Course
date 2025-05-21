package ai.indxo;

public class FinalizeMethod {

	protected void finalize() throws Throwable {
		System.out.println("finalize() method called before object is garbage collected.");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Main obj = new Main();
		obj = null; // Eligible for garbage collection
		// Request JVM to run Garbage Collector
		System.gc();
		System.out.println("Main method completed.");
		
	}

}
