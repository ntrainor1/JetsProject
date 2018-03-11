package com.skilldistillery.projects.jets;

public class AirField {
	private Jet jetFleet[] = new Jet[20];

	public AirField() {
		jetFleet[0] = new CargoJet("Great Heron", 79, 400, 82_200_000L);
		jetFleet[1] = new JetImpl("Skipper", 49, 300, 590_000L);
		jetFleet[2] = new CargoJet("CAN-722", 129, 700, 218_450_000L);
		jetFleet[3] = new FighterJet("McDonnell Douglas F-15 Eagle", 1850, 2992, 70_000_000L);
		jetFleet[4] = new FighterJet("Lockheed-Martin F-22", 1450, 1800, 78_200_000_000L);
	}

	public void listFleet() {
		int totalJets = 0;
		
		for (int i = 0; i < jetFleet.length; i++) {
			if (jetFleet[i] == null) {
				break;
			}
			else {
				jetFleet[i].listSpecs();
				totalJets++;
			}
		}
		
		System.out.println("You have a total of " + totalJets + " jets in your fleet.");
	}

	public void flyFleet() {
		for (int i = 0; i < jetFleet.length; i++) {
			if (jetFleet[i] == null) {
				break;
			}
			else {
				jetFleet[i].fly();
			}
		}
	}
	
	public void addJet(String newModel, double newSpeed, int newRange, long newPrice, char newType) {
		for (int i = 0; i < jetFleet.length; i++) {
			if (jetFleet[i] != null) {
				continue;
			}
			else {
				if (newType == 'F' || newType == 'f') {
					FighterJet newFighter = new FighterJet(newModel, newSpeed, newRange, newPrice);
					jetFleet[i] = newFighter;
					break;
				}
				else if (newType == 'C' || newType == 'c') {
					CargoJet newCargo = new CargoJet(newModel, newSpeed, newRange, newPrice);
					jetFleet[i] = newCargo;
					break;
				}
				else {
					JetImpl regularJet = new JetImpl(newModel, newSpeed, newRange, newPrice);
					jetFleet[i] = regularJet;
					break;
				}
			}
		}
	}

	public void findFastest() {
		Double fastestSpeed = new Double(0);
		Jet fastestJet = jetFleet[0];

		for (int i = 0; i < jetFleet.length; i++) {
			if (jetFleet[i] == null) {
				break;
			}
			else {
				if (jetFleet[i].getSpeed() > fastestSpeed) {
					fastestJet = jetFleet[i];
					fastestSpeed = jetFleet[i].getSpeed();
				}
			}
		}

		System.out.println();
		System.out.println("The fastest jet in your fleet is the " + fastestJet.getModel() + " that has the speed of "
				+ fastestJet.getSpeed() + " MPH.");
		System.out.println("It's " + fastestJet.getPrice() + " dollars, but worth it! Its range is "
				+ fastestJet.getRange() + " miles.");
	}

	public void findLongest() {
		Integer longestRange = new Integer(0);
		Jet longestJet = jetFleet[0];

		for (int i = 0; i < jetFleet.length; i++) {
			if (jetFleet[i] == null) {
				break;
			}
			else {
				if (jetFleet[i].getRange() > longestRange) {
					longestJet = jetFleet[i];
					longestRange = jetFleet[i].getRange();
				}
			}
		}

		System.out.println();
		System.out.println("The jet with the longest range in your fleet is the " + longestJet.getModel()
				+ " that has a range of " + longestJet.getRange() + " miles.");
		System.out.println("It's " + longestJet.getPrice() + " dollars, but worth it! Its speed is "
				+ longestJet.getSpeed() + " MPH.");
	}
	
	public void loadingJets() {
		for (int i = 0; i < jetFleet.length; i++) {
			Jet testJet = jetFleet[i];
			
			if (jetFleet[i] == null) {
				break;
			}
			else {
				if (testJet.getClass().getSimpleName().equals("CargoJet")) {
					((CargoJet) testJet).loadCargo();
					System.out.println("The " + testJet.getModel() + " is now loading cargo!");
					System.out.println();
				}
				else {
					continue;
				}
			}
		}
	}
	
	public void dogfight() {
		for (int i = 0; i < jetFleet.length; i++) {
			Jet testJet = jetFleet[i];
			
			if (jetFleet[i] == null) {
				break;
			}
			else {
				if (testJet.getClass().getSimpleName().equals("FighterJet")) {
					((FighterJet) testJet).fight();
					System.out.println("The " + testJet.getModel() + " is now on the attack!");
					System.out.println();
				}
				else {
					continue;
				}
			}
		}
	}
}
