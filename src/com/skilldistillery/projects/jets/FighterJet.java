package com.skilldistillery.projects.jets;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {
		System.out.println('\u266A' + " And the rockets' red glare " + '\u266A');
		System.out.println('\u266A' + " The bombs bursting in air " + '\u266A');
		System.out.println('\u266A' + " Gave proof through the night " + '\u266A');
		System.out.println('\u266A' + " That our flag was still there " + '\u266A');
	}
	
	

}
