package demo.view;

import demo.model.*;

public class Display {
	
	public static void viewDetails(ToyotaVehicle vehicleType){
		
		if (vehicleType instanceof Fortuner){
			Fortuner fortuner = (Fortuner) vehicleType;
			fortuner.viewModel();
			fortuner.viewPrice();
		}else if (vehicleType instanceof  Prado){
			Prado prado= (Prado) vehicleType;
			prado.viewModel();
			prado.viewPrice();
		}else if (vehicleType instanceof  LandCruiser){
			LandCruiser landcruiser = (LandCruiser) vehicleType;
			landcruiser.viewModel();
			landcruiser.viewPrice();
		}else if (vehicleType instanceof  HiLux){
			HiLux hilux = (HiLux) vehicleType;
			hilux.viewModel();
			hilux.viewPrice();
		}else if (vehicleType instanceof  Wigo){
			Wigo wigo = (Wigo) vehicleType;
			wigo.viewModel();
			wigo.viewPrice();
		}
	}

}
