import java.util.Scanner;
import java.util.Random;

public class simulation extends infection {

	int day = 0;
	int totalNumberOfInfected = 0;
	int totalNumberOfDead = 0;

	public void execute (subject[][] grid, int minSick, int maxSick, double deathPercent, double infectPercent) {

		String x = "X";
		String o = "o";
		String d = "d";

		Random rn = new Random();
		double infectR = rn.nextDouble();
		double deathR = rn.nextDouble();

		int diedToday = 0;
		int infectedToday = 0;

		int peopleRecovered = 0;


		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {

				if (infectR <= infectPercent) {
					grid[i][j].setStatus(true);
					infectedToday ++;
				}

				if (grid[i][j].getStatus()) {

					if (deathR <= deathPercent) {
					grid[i][j].setDead(true);
					System.out.print(" " + d );
				} 
				else {
						System.out.print(" " + x);
						totalNumberOfInfected ++;
					}
				} else {
					System.out.print(" " + o);
				}
			}
			System.out.println();
		}


		System.out.println( '\n' + "It is day: " + day + '\n' + "Today " + infectedToday
			+ " got infected." + '\n' + "The total number of infected are: " + totalNumberOfInfected + '\n'
			+ "Today " + diedToday + " people died." + '\n' + "The total number of dead is: "
			+ totalNumberOfDead  + '\n' + "Today " + peopleRecovered + " people recovered from the infection.");

		day++;

 	}
}