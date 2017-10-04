import java.util.Scanner;
import java.util.Random;

public class simulation extends infection {

	int day = 1;
	int totalNumberOfInfected = 0;
	int totalNumberOfDead = 0;


	public void execute (subject[][] grid, double deathPercent, double infectPercent, int maxSick, int minSick) {

		String x = "X";
		String o = "o";
		String d = ".";

		Random rn = new Random();

		int randomTime = rn.nextInt((maxSick-minSick) + 1) + minSick;

		System.out.println(randomTime);

		int diedToday = 0;
		int infectedToday = 0;

		int peopleRecovered = 0;


		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {

				double infectR  = 	  rn.nextDouble();
				double deathR   =	  rn.nextDouble();
				hasNeighbour hn = new hasNeighbour();

				if (infectR <= infectPercent) {
					if (hn.check(grid, i, j) && !grid[i][j].getSick() && !grid[i][j].getDead()) {
						grid[i][j].setSick(true);
						grid[i][j].setDisabled(true);
						grid[i][j].setTime(randomTime);
						infectedToday ++;
					}
				}

				if (grid[i][j].getSick()) {

					if (deathR <= deathPercent && grid[i][j].isDisabled) {
						grid[i][j].setDead(true);
						grid[i][j].setSick(false);
						System.out.print(" " + d );
						diedToday++;
					} else {

					if (grid[i][j].getTime() > 0) {
						grid[i][j].countDown();
						System.out.print(" " + x);
					} else {

						grid[i][j].setSick(false);
						peopleRecovered++;
						System.out.print(" " + o);
						}
					}
				} else {
					if (grid[i][j].getDead()) {
						System.out.print(" " + d);
					} else {
					System.out.print(" " + o);
					}
				}
			}
			System.out.println();
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j].setDisabled(false);
			}
		}

		totalNumberOfDead += diedToday;
		totalNumberOfInfected += infectedToday;
		totalNumberOfInfected -= peopleRecovered;
		totalNumberOfInfected -= diedToday; 

		System.out.println( '\n' + "It is day: " + day + '\n' + "Today " + infectedToday
			+ " got infected." + '\n' + "The total number of infected are: " + totalNumberOfInfected + '\n'
			+ "Today " + diedToday + " people died." + '\n' + "The total number of dead is: "
			+ totalNumberOfDead  + '\n' + "Today " + peopleRecovered + " people recovered from the infection.");

		day++;

		System.out.println("Hit Enter to continue.");
		String s = sc.nextLine();

		if (s.equals("")){
			execute(grid, deathPercent, infectPercent, maxSick, minSick);
		}

 	}
}