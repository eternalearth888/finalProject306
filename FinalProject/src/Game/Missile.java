/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;


public class Missile {
	private double angle; 		//may use int
	private Point point = new Point(0,0);
	private double velocity;
	
	public Missile() {
		angle = 0;
		velocity = 35.0;
	}

	public void draw(Graphics g) {}
	
	public double getAngle() {
		return angle;
	}
	
	public boolean checkValidAngle(double a) {
		if (a >= 0 && a <= 360) {
			return true;
		} else {
			return false;
		}
	}

	public void pickAngle(double a) {
		if (checkValidAngle(a)) {
			angle = a;
		} else {
			angle = 0;
		}
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
		return Math.cos(Math.toRadians(angle)) * velocity;
	}
	
	public double getVerticalVelocity(double angle, double velocity) {
		return Math.sin(Math.toRadians(angle)) * velocity;
	}
	
	public Point getPositionAt(double time) {
		 double x = getHorizontalVelocity(angle, velocity) * time;
         double y = getVerticalVelocity(angle, velocity) * time - 0.5 * (9.8 * time * time);
         Point currPoint;
         currPoint = new Point((int)Math.round(x) + point.x, (int)Math.round(y) + point.y);
         if (currPoint.getX() < 0.0) {
        	 currPoint.x = 0;
         }
         if (currPoint.getY() < 0.0) {
        	 currPoint.y = 0;
         }
         return currPoint;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	//be sure to recall gethoriz and getVert velocity
	public void pickRandomVelocity() {
		Random rand = new Random();
		int newVelocity = rand.nextInt(50);
		while(newVelocity == 0) {
			newVelocity = rand.nextInt(50);
		}
		velocity = newVelocity;
		
	}

}
