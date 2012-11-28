/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Color;
import java.awt.Graphics;


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
		//slingshot
		Color slingColor = new Color(160, 82, 45);
		g.setColor(slingColor);
		g.fillRect(70, 530, 40, 100);
		g.fillOval(50, 470, 90, 90);
		g.fillRect(90, 500, 80, 30);
	}
	
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
