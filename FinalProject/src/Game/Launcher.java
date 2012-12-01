/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Launcher extends Structure {
	private int shotsTaken;
	private Missile missile;
	
	public Launcher() {
		shotsTaken = 0;
		missile = new Missile();
	}
	
	public void reset() {
		shotsTaken = 0;
		missile.reset();
	}
	
	@Override
	public void draw(Graphics g) {
		 Graphics2D g2 = (Graphics2D)g;
		
		//launcher
		Color launcherColor = new Color(160, 82, 45);
		g2.setColor(launcherColor);
		g2.fillRect(70, 530, 40, 100);
		g2.fillOval(50, 470, 90, 90);
		g2.fillRect(90, 500, 80, 30);
	}
	
	public int getShotsTaken() {
		return shotsTaken;
	}

	public void incShotsTaken() {
		shotsTaken++;
	}

	public Missile getMissile() {
		return missile;
	}

	public void setMissile(Missile missile) {
		this.missile = missile;
	}

	public void shoot(Missile missile) {}
	
	

}
