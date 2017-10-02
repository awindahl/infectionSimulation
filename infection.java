import java.util.Scanner;

public class infection {

		/**
		Code written by Alexander Windahl
		Purpose of program is to test infection spread rate based
		on user inputs. Creative liberties were taken when designing
		user interaction

		This program is free software and published under GPL 3.0

		**/

	public static void main (String args[]) {	

		Scanner sc = new Scanner(System.in);

		System.out.println
		(
		"Hello and welcome to the infection chamber." + '\n' +
		"To start, we need you to enter a few values." + '\n' +
		"First of all, are you doing a custom test?" +'\n'+
		"Please answer Yes, or No." + '\n'
		);

		String s = sc.nextLine();

		if (s.equals("Yes")){
			System.out.println("");
			customTest();
		}

		if (s.equals("No")) {
			System.out.println("");
			preMadeTest();

		}

		else {
			System.out.println ("Please restart.");
		}
	}


	public static void preMadeTest() {

		int 		 totalPopulation;
		double 		 deathPercent;
		double 		 infectPercent;
		int 		 minSick;
		int 		 maxSick;
		int 		 initialIll;
		int 		 xPosition;
		int 		 yPosition;

		Scanner sc = new Scanner(System.in);

		System.out.println(
			"Ok, Great." +'\n' +
			"Which one of the following test groups would you like to test?" + '\n' +
			"HT14, HT15, HT16 or HT17?" + '\n' +
			"Keep in mind, answer is case-sensitive." + '\n'
			);

		String s = sc.nextLine();

		System.out.println("");

		if (s.equals("HT14")) {

			totalPopulation = 50;
			minSick = 4;
			maxSick = 8;
			deathPercent = 0;
			infectPercent = 0.1;
			initialIll = 1;
			xPosition = 25;
			yPosition = 25;

			subject[][] grid = new subject[totalPopulation][totalPopulation];

			for (int i = 0; i < totalPopulation; i++) {
				for (int j = 0; j < totalPopulation; j++) {
					grid[i][j] = new subject();
				}
			}

			System.out.println(
				"Great, the parameters are," + '\n' +
				"Population: " + totalPopulation + '\n' +
				"Probability of death: " + deathPercent + '\n' +
				"Probability of infection: " + infectPercent + '\n' +
				"Minimum days a person can be sick: " + minSick + '\n' +
				"Maximum days a person can be sick: " + maxSick + '\n' +
				"The number of people who are ill from the start: " + initialIll + '\n' +
				"Whose position is: " + xPosition + ", " + yPosition + '\n' 
				);

			grid[xPosition][yPosition].setStatus(true);

			simulation sim = new simulation();
			sim.execute(grid, minSick, maxSick, deathPercent, infectPercent);

		}

		if (s.equals("HT15")){
			System.out.println("LOL");
		}
		if (s.equals("HT16")){
			System.out.println("LOL");
		}
		if (s.equals("HT17")){
			System.out.println("LOL");
		}
	}




	public static void customTest() {
		System.out.println("LOL");
	}







}
