package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class JetsApp {
	Scanner kb = new Scanner(System.in);
	AirField newField = new AirField();

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.runApp();
	}

	private void runApp() {
		System.out.println("*****************************");
		System.out.println("*      WELCOME TO JETS      *");
		System.out.println("*****************************");
		menu();

		while (true) {
			String userInput = kb.nextLine();

			if (userInput.equals("")) {
				menu();
				continue;
			}
			if ((userInput).charAt(0) == '1') {
				System.out.println();
				newField.listFleet();
				menu();
				continue;
			}
			if ((userInput).charAt(0) == '2') {
				System.out.println();
				System.out.println("Now, you can");
				System.out.println();
				System.out.println("   " + '\u266B' + " FLY " + '\u266A');
				System.out.println("         " + '\u266B' + " LIKE " + '\u266A');
				System.out.println("                " + '\u266B' + " AN " + '\u266A');
				System.out.println("                     " + '\u266B' + " EAGLE " + '\u266A');
				System.out.println();
				newField.flyFleet();
				menu();
				continue;
			}
			if ((userInput).charAt(0) == '3') {
				newField.findFastest();
				menu();
				continue;
			}
			if ((userInput).charAt(0) == '4') {
				newField.findLongest();
				menu();
				continue;
			}
			if ((userInput).charAt(0) == '5') {
				createNewJet();
				continue;
			}
			if ((userInput).charAt(0) == '6') {
				System.out.println();
				System.out.println('\u266A' + " And the rockets' red glare " + '\u266A');
				System.out.println('\u266A' + " The bombs bursting in air " + '\u266A');
				System.out.println('\u266A' + " Gave proof through the night " + '\u266A');
				System.out.println('\u266A' + " That our flag was still there " + '\u266A');
				System.out.println();

				newField.dogfight();
				menu();
				continue;
			}
			if ((userInput).charAt(0) == '7') {
				System.out.println();
				System.out.println("Now loading cargo!");
				System.out.println();

				newField.loadingJets();
				menu();
				continue;
			}
			if ((userInput).charAt(0) == '8') {
				System.out.println();
				System.out.println("GOODBYE!");
				break;
			}
			else {
				System.out.println();
				System.out.println("Input a correct option.");
				menu();
				continue;
			}

		}

		kb.close();
	}

	private void menu() {
		System.out.println();
		System.out.println("*****************************");
		System.out.println("*                           *");
		System.out.println("*        PRESS A KEY        *");
		System.out.println("*                           *");
		System.out.println("*   (1) LIST FLEET          *");
		System.out.println("*   (2) FLY FLEET           *");
		System.out.println("*   (3) SHOW FASTEST JET    *");
		System.out.println("*   (4) SHOW LONGEST RANGE  *");
		System.out.println("*   (5) ADD TO FLEET        *");
		System.out.println("*   (6) FIGHT JETS          *");
		System.out.println("*   (7) LOAD JETS           *");
		System.out.println("*   (8) QUIT                *");
		System.out.println("*                           *");
		System.out.println("*****************************");
	}

	private void createNewJet() {
		System.out.println("Is your jet a regular jet (R), a fighter jet (F), or a cargo jet (C)?");
		char newType = kb.nextLine().charAt(0);

		System.out.println("What is the model of your jet?");
		String newModel = kb.nextLine();

		System.out.println("What is the speed of your jet?");
		Double newSpeed = kb.nextDouble();

		System.out.println("What is the range of your jet?");
		Integer newRange = kb.nextInt();

		System.out.println("What is the price of your jet?");
		Long newPrice = kb.nextLong();

		newField.addJet(newModel, newSpeed, newRange, newPrice, newType);
	}

}
