package ai.indxo;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleImp vehicle = new VehicleImp();
		vehicle.start();
		vehicle.stop();
		
		vehicle.clean();
		
		IVehicle.run();
		
		vehicle.run();

	}

}
