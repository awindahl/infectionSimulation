
public class subject {

	public boolean isInfected = false;
	public boolean isDead = false;

	public int minSick = 0;
	public int maxSick = 0;

	public void setSick (boolean b) {
		this.isInfected = b;
	}

	public boolean getSick() {
		return isInfected;
	}

	public void setDead(boolean b) {
		this.isDead = b;
	}

	public boolean getDead () {
		return isDead;
	}
}
