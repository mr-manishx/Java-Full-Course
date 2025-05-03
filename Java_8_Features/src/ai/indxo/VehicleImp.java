package ai.indxo;

public class VehicleImp implements IVehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println("Vehicle started...");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle stoped...");
	}
	
	public void run() {
		System.out.println("run method override using implementation class");
	}
}
