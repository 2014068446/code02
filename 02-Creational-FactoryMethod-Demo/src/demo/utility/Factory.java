package demo.utility;

import demo.controller.FactoryMethodDemo;
import demo.model.*;

public class Factory {
	
	public static ToyotaVehicle getObject(String input){
		//type of object that will be returned
		ToyotaVehicle vehicle = null;
		/*
		 when creating the factory method, the return type if the method is always your common superclass.
		 the creation of the object is based on the value of the String content.
		 */
		
		switch (input){
		/*
		 to complete the factory method, the object conversion is upcasting = the data type on the right (when looking at the code)
		 is always smaller than the data type on the left(parent).  
		 */
			case "LAND CRUISER":
				vehicle = new LandCruiser();
				break;
			case "HILUX":
				vehicle = new HiLux();
				break;
			case "PRADO":
				vehicle = new Prado();
				break;
			case "WIGO":
				vehicle = new Wigo();
				break;
			case "FORTUNER":
				vehicle = new Fortuner();
			break;
		}
		return vehicle;
	}
}
