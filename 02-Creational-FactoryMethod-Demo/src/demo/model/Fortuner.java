package demo.model;

public class Fortuner extends ToyotaVehicle {

	@Override
	public void viewModel() {
		System.out.println("2017 Toyota Fortuner 4x4");
		System.out.println("All power that can climb" + "Batasan Hills.");
	}

	@Override
	public void viewPrice() {
		System.out.println("Php 1,830,000.000");
	}

}
