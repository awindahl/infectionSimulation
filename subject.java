
public class subject {

	public boolean isInfected = false;
	public boolean isDead = false;
	public boolean isDisabled = false;
	public boolean beenSickEver = false;

	public int sickTime = 0;

	public void setBeenSick(boolean b) {
		this.beenSickEver = b;
	}

	public boolean getBeenSick() {
		return beenSickEver;
	}

	public void setDisabled (boolean b) {
		this.isDisabled = b;
	}

	public boolean isDisabled () {
		return isDisabled;
	}

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

	public void setTime(int y) {
		this.sickTime = y;
	}

	public int getTime() {
		return sickTime;
	}

	public void countDown() {
		this.sickTime = this.sickTime-1;
	}

}
