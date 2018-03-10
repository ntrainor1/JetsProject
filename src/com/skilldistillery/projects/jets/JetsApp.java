package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class JetsApp {

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.runApp();
	}

	private void runApp() {
		Scanner kb = new Scanner(System.in);

		System.out.println("*****************************");
		System.out.println("*      WELCOME TO JETS      *");
		System.out.println("*****************************");

		AirField newField = new AirField();

		while (true) {
			menu();
			char userInput = (kb.nextLine()).charAt(0);

			if (userInput == '1') {
				System.out.println();
				newField.listFleet();
				continue;
			}
			if (userInput == '2') {
				System.out.println();
				System.out.println("Now, you can");
				System.out.println();
				System.out.println("   " + '\u266B' + " FLY " + '\u266A');
				System.out.println("         " + '\u266B' + " LIKE " + '\u266A');
				System.out.println("                " + '\u266B' + " AN " + '\u266A');
				System.out.println("                     " + '\u266B' + " EAGLE " + '\u266A');
				System.out.println();
				newField.flyFleet();
				continue;
			}
			if (userInput == '3') {
				newField.findFastest();
				continue;
			}
			if (userInput == '4') {
				newField.findLongest();
				continue;
			}
			if (userInput == '5') {
				continue;
			}
			if (userInput == '6') {
				System.out.println();
				System.out.println('\u266A' + " And the rockets' red glare " + '\u266A');
				System.out.println('\u266A' + " The bombs bursting in air " + '\u266A');
				System.out.println('\u266A' + " Gave proof through the night " + '\u266A');
				System.out.println('\u266A' + " That our flag was still there " + '\u266A');
				System.out.println();
				
				newField.dogfight();
				continue;
			}
			if (userInput == '7') {
				System.out.println();
				System.out.println("Now loading cargo!");
				System.out.println();
				
				newField.loadingJets();
				continue;
			}
			if (userInput == '8') {
				System.out.println();
				System.out.println("GOODBYE!");
				break;
			}
			else {
				System.out.println();
				System.out.println("Input a correct option.");
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

}
