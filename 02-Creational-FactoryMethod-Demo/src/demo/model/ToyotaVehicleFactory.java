package demo.model;

public interface ToyotaVehicleFactory {

	//by default, all methods declared are public abstract
	ToyotaVehicle getVehicle(String vehicleType);
}
