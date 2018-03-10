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
				System.out.println("   FLY");
				System.out.println("         LIKE");
				System.out.println("                AN");
				System.out.println("                     EAGLE");
				continue;
			}
			if (userInput == '3') {
				continue;
			}
			if (userInput == '4') {
				continue;
			}
			if (userInput == '5') {
				continue;
			}
			if (userInput == '6') {
				continue;
			}
			if (userInput == '7') {
				continue;
			}
			if (userInput == '8') {
				System.out.println("GOODBYE!");
				break;
			}
			else {
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
		System.out.println("*    (1) LIST FLEET         *");
		System.out.println("*    (2) FLY FLEET          *");
		System.out.println("*    (3) SHOW FASTEST JET   *");
		System.out.println("*    (4) SHOW LONGEST RANGE *");
		System.out.println("*    (5) ADD TO FLEET       *");
		System.out.println("*    (6) FIGHT JETS         *");
		System.out.println("*    (7) LOAD JETS          *");
		System.out.println("*    (8) QUIT               *");
		System.out.println("*                           *");
		System.out.println("*****************************");
	}

}
