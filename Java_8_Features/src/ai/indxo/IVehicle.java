package ai.indxo;

public interface IVehicle {

	// abstract method
	public void start();
	
	public void stop();
	
	// concrete method
	public default void clean() {
		System.out.println("Vehicle cleaning is process..");
	}
	
	// static method
	public static void run() {
		System.out.println("Vehicle in running mode..");
	}
}
