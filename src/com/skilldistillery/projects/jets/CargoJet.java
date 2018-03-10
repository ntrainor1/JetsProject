package com.skilldistillery.projects.jets;

public class CargoJet extends Jet implements CargoCarrier{

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo(int loadingCargo) {
		System.out.println("Now loading: " + loadingCargo + " tons of cargo.");
	}

}
