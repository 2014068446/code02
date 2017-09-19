package demo.controller;

import demo.model.*;
import demo.utility.*;
import demo.view.*;

public class FactoryMethodDemo {

		public static void main (String args []){
			//create object based on the client's preference
			String truckTypeInput = Input.getString(" your preferred vehicle");
			
			//now we create and object based on the client's preference
			ToyotaVehicle sasakyan = Factory.getObject(truckTypeInput.toUpperCase());
			
			//once the object is created, pass the very same object on View for printing purposes
			Display.viewDetails(sasakyan);

			

		}
}
