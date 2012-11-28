/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JOptionPane;


public class Missile {
	private double angle; 		//may use int
	private Point point = new Point(65, 495);
	private double velocity;
	
	public Missile() {
		angle = 0;
		velocity = 35.0;
	}
	
	public void reset() {
		angle = 0;
		velocity = 35.0;
	}

	public void draw(Graphics g) {
		Color missileColor = new Color(20, 82, 45);
		g.setColor(missileColor);
		System.out.println("Redraw... " + point.x + " " + point.y);
		g.fillOval(point.x, point.y, 45, 45);
	}
	
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
			JOptionPane.showMessageDialog(null, "Invalid Angle, Angle now set to 0.");
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
