public class hasNeighbour {

	public boolean check  (subject[][] grid, int i, int j) {

				//check top row
				if (i>=1 && j >= 1) {

					if (grid[i-1][j-1].getSick() & !grid[i-1][j-1].isDisabled) {
						grid[i-1][j-1].setDisabled(true);
						return true;
					}
				}

				if (i >= 1) {

					if (grid[i-1][j].getSick() && !grid[i-1][j].isDisabled) {
						grid[i-1][j].setDisabled(true);
						return true;
					}
				}

				if (i >= 1 && j < grid.length-1) {
					
					if (grid[i-1][j+1].getSick()&& !grid[i-1][j+1].isDisabled) {
						grid[i-1][j+1].setDisabled(true);
						return true;
					}	
				}

				//check middle row
				if (j>= 1) {

					if (grid[i][j-1].getSick() && !grid[i][j-1].isDisabled) {
						grid[i][j-1].setDisabled(true);
						return true;
					}
				}

				if (j < grid.length-1) {

					if (grid[i][j+1].getSick() && !grid[i][j+1].isDisabled) {
						grid[i][j+1].setDisabled(true);
						return true;
					}	
				}

				// check bottom row

				if (i < grid.length-1 && j >= 1) {
					
					if (grid[i+1][j-1].getSick() && !grid[i+1][j-1].isDisabled) {
						grid[i+1][j-1].setDisabled(true);
						return true;
					}
				}

				if ( i < grid.length-1) {

					if (grid[i+1][j].getSick() && !grid[i+1][j].isDisabled) {
						grid[i+1][j].setDisabled(true);
						return true;
					}
				}

				if (i < grid.length-1 && j < grid.length-1) {
					
					if (grid[i+1][j+1].getSick() && !grid[i+1][j+1].isDisabled) {
						grid[i+1][j+1].setDisabled(true);
						return true;
					}
				}
		return false;
	}
}