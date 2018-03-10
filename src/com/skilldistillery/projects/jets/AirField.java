package com.skilldistillery.projects.jets;

public class AirField {
	private Jet jetFleet[] = new Jet[20];

	public AirField() {
		jetFleet[0] = new CargoJet("Great Heron", 79, 400, 82_200_000L);
		jetFleet[1] = new JetImpl("Skipper", 49, 300, 590_000L);
		jetFleet[2] = new CargoJet("CAN-722", 129, 700, 218_450_000L);
		jetFleet[3] = new FighterJet("Lockheed-Martin F-22", 1450, 1800, 78_200_000_000L);
		jetFleet[4] = new FighterJet("McDonnell Douglas F-15 Eagle", 1850, 2992, 70_000_000L);
	}
	
	public void listFleet() {
		for (int i = 0; i < jetFleet.length; i++) {
			if (jetFleet[i] == null) {
				break;
			}
			else {
				jetFleet[i].listSpecs();;
			}
		}
	}
	
}
