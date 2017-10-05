import java.util.Scanner;
import java.util.Random;

public class infection {

		/**
		Code written by Alexander Windahl on 2/10-17 and is available
		at https://github.com/awindahl/infectionSimulation

		Purpose of program is to test infection spread rate based
		on user inputs. Creative liberties were taken when designing
		user interaction

		This program is free software and published under LGPL 3.0

		**/

	public static void main (String args[]) {	

		Scanner sc = new Scanner(System.in);

		System.out.println
		(
		"Hello and welcome to the infection testchamber." + '\n' +
		"To start, we need you to enter a few values." + '\n' +
		"First of all, are you performing a custom test?" +'\n'+
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
			System.out.println ("Shutting down...");
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
			deathPercent = 0.0;
			infectPercent = 0.05;
			initialIll = 1;
			xPosition = 25;
			yPosition = 25;

			Random rn = new Random();

			int randomTime = rn.nextInt((maxSick-minSick) + 1) + minSick;

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

			grid[xPosition][yPosition].setSick(true);
			grid[xPosition][yPosition].setTime(randomTime);

			simulation sim = new simulation();
			sim.execute(grid, deathPercent, infectPercent, maxSick, minSick);

		}

		if (s.equals("HT15")){
			
			totalPopulation = 50;
			minSick = 3;
			maxSick = 9;
			deathPercent = 0.0;
			infectPercent = 0.10;
			initialIll = 1;
			xPosition = 25;
			yPosition = 25;

			Random rn = new Random();

			int randomTime = rn.nextInt((maxSick-minSick) + 1) + minSick;

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

			grid[xPosition][yPosition].setSick(true);
			grid[xPosition][yPosition].setTime(randomTime);

			simulation sim = new simulation();
			sim.execute(grid, deathPercent, infectPercent, maxSick, minSick);

		}
		if (s.equals("HT16")){
			
			totalPopulation = 50;
			minSick = 1;
			maxSick = 12;
			deathPercent = 0.0;
			infectPercent = 0.20;
			initialIll = 1;
			xPosition = 25;
			yPosition = 25;

			Random rn = new Random();

			int randomTime = rn.nextInt((maxSick-minSick) + 1) + minSick;

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

			grid[xPosition][yPosition].setSick(true);
			grid[xPosition][yPosition].setTime(randomTime);

			simulation sim = new simulation();
			sim.execute(grid, deathPercent, infectPercent, maxSick, minSick);

		}
		if (s.equals("HT17")){

			totalPopulation = 40;
			minSick = 6;
			maxSick = 9;
			deathPercent = 0.0;
			infectPercent = 0.40;
			initialIll = 1;
			xPosition = 20;
			yPosition = 20;

			Random rn = new Random();

			int randomTime = rn.nextInt((maxSick-minSick) + 1) + minSick;

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

			grid[xPosition][yPosition].setSick(true);
			grid[xPosition][yPosition].setTime(randomTime);

			simulation sim = new simulation();
			sim.execute(grid, deathPercent, infectPercent, maxSick, minSick);

		}
	}


	public static void customTest() {
		
		int 		 totalPopulation;
		double 		 deathPercent;
		double 		 infectPercent;
		int 		 minSick;
		int 		 maxSick;
		int 		 initialIll;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ok, great. Keep in mind, the test will be performed in an " + '\n' +
			"NxN grid. This means the total population will be NxN large. How big is N?");

		totalPopulation = sc.nextInt();

		System.out.println("Ok, " + totalPopulation*totalPopulation + " people will be tested." + '\n' +
			"How many are sick from the start?");

		initialIll = sc.nextInt();
		int[] xPosition = new int[initialIll];
		int[] yPosition = new int[initialIll];

		for (int i = 0; i < initialIll; i++) {
			System.out.println("Where is patient# " + i + " located?" + '\n' + 
				"Please write one value at a time.");
			xPosition[i] = sc.nextInt();
			yPosition[i] = sc.nextInt();
		}

		System.out.println("What is the minimum amount of days a subject can be sick?");

		minSick = sc.nextInt();

		System.out.println("What is the maximum amount of days a subject can be sick?");

		maxSick = sc.nextInt();	

		System.out.println("How likely is it that a person will die?" + '\n' + 
			"Answer with a decimal. eg 0.20 for twenty percent.");

		deathPercent = sc.nextDouble();	

		System.out.println("How likely is it that a person will infect an adjacent subject?" + '\n' + 
			"Answer with a decimal. eg 0.20 for twenty percent.");	

		infectPercent = sc.nextDouble();

		Random rn = new Random();

		int randomTime = rn.nextInt((maxSick-minSick) + 1) + minSick;

		subject[][] grid = new subject[totalPopulation][totalPopulation];

		for (int i = 0; i < totalPopulation; i++) {
			for (int j = 0; j < totalPopulation; j++) {
				grid[i][j] = new subject();
			}
		}

		for (int i = 0; i < initialIll; i++) {
			grid[xPosition[i]][yPosition[i]].setSick(true);	
			grid[xPosition[i]][yPosition[i]].setTime(randomTime);
		}

		simulation sim = new simulation();
		sim.execute(grid, deathPercent, infectPercent, maxSick, minSick);

	}
}
