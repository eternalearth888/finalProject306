/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Graphics;


public class Launcher extends Structure {
	private int shotsTaken;
	private Missile missile;
	
	public Launcher() {
		shotsTaken = 0;
		missile = new Missile();
	}	
	
	
	@Override
	public void draw(Graphics g) {}
	
	public int getShotsTaken() {
		return shotsTaken;
	}

	public void setShotsTaken(int shotsTaken) {
		this.shotsTaken = shotsTaken;
	}

	public Missile getMissile() {
		return missile;
	}

	public void setMissile(Missile missile) {
		this.missile = missile;
	}

	public void shoot(Missile missile) {}
	
	

}
