package demo.model;

public class HiLux extends ToyotaVehicle {

	@Override
	public void viewModel() {
		System.out.println("2017 Toyota HiLux 4x4");
		System.out.println("A pickup that likes to" + "keep up.");
	}

	@Override
	public void viewPrice() {
		System.out.println("Php 950,000.00");

	}

}
