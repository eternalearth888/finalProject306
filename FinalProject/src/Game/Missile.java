/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Graphics;
import java.awt.Point;


public class Missile {
	private double angle; 		//may use int
	private Point point = new Point(0,0);
	private double velocity;
	
	public Missile() {
		angle = 0;
		velocity = 35.0;
	}

	public void draw(Graphics g) {}
	
	public void checkValidAngle() {}
	
	public double getAngle() {
		return angle;
	}

	public void pickAngle(double angle) {
		checkValidAngle();
		this.angle = angle;
	}
	
	public double getVelocity() {
		return velocity;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public double getHorizontalVelocity(double angle, double velocity) {
		return velocity;
		//logic in email
	}
	
	public double getVerticalVelocity(double angle, double velocity) {
		return velocity;
		//logic in email
	}
	
	public Point getPositionAt(double time) {
		return point;
		//logic in email
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	public void pickRandomVelocity() {} //be sure to recall gethoriz and getVert velocity

}
