public class hasNeighbour {

	public boolean check  (subject[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j<grid.length; j++){


				//check top row
				if ( i>=1 && j >= 1) {

					if (grid[i-1][j-1] != null) {
						if (grid[i-1][j-1].getSick()) {
							return true;
						}
					}

					if (grid[i-1][j] != null) {
						if (grid[i-1][j].getSick()) {
							return true;
						}
					}
				}

				if (i >= 1 && j < grid.length-1) {
					if (grid[i-1][j+1] != null) {
						if (grid[i-1][j+1].getSick()) {
							return true;
						}
					}
				}

				//check middle row
				if (j>= 1) {

					if (grid[i][j-1] != null) {
						if (grid[i][j-1].getSick()) {
							return true;
						}
					}
				}

				if (j < grid.length-1) {
					if (grid[i][j+1] != null) {
						if (grid[i][j+1].getSick()) {
							return true;
						}
					}
				}

				// check bottom row

				if (i < grid.length-1 && j >= 1) {
					if (grid[i+1][j-1] != null) {
						if (grid[i+1][j-1].getSick()) {
							return true;
						}
					}
				}

				if (i < grid.length-1 && j < grid.length-1) {


					if (grid[i+1][j] != null) {
						if (grid[i+1][j].getSick()) {
							return true;
						}
					}

					if (grid[i+1][j+1] != null) {
						if (grid[i+1][j+1].getSick()) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}