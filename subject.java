
public class subject {

	public boolean isInfected = false;
	public boolean isDead = false;

	public int xPos = 0;
	public int yPos = 0;

	public void setPos (int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}

	public boolean setStatus (boolean b) {
		this.isInfected = b;
		return isInfected;
	}

	public boolean getStatus() {
		return isInfected;
	}

	public boolean setDead(boolean b) {
		this.isDead = b;
		return isDead;
	}
}
