/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


public class Missile {
	private double angle; 		//may use int
	private Point point;
	private double x = 75.0;
	private double y = 495.0;
	private double velocity;
	
	public Missile() {
		angle = 0;
		velocity = 25.0;
		point = new Point(75, 495);
	}
	
	public void reset() {
		angle = 0;
		velocity = 25.0;
		point = new Point(75, 495);
	}
	
	public void setDefaults() {
		angle = 0;
		point = new Point(75, 495);
	}

	public void draw(Graphics g) {
		 Graphics2D g2 = (Graphics2D)g;
		
		// missile
		Color missileColor = new Color(20, 82, 45);
		g2.setColor(missileColor);
		g2.fillOval(point.x, point.y, 45, 45);
		
		// angle representation
		Stroke s = new BasicStroke(4.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 1.0f, new float[] {15.0f,15.0f}, 0.0f);
		int lineLength = 200;
		g2.setStroke(s);
		g2.draw(new Line2D.Double(x + 10, y + 20, x + lineLength, y + 20));
		g2.draw(new Line2D.Double(x + 10, y + 20, x + 10 + lineLength*Math.sin(Math.toRadians(angle + 90)), y + 20 + lineLength*Math.cos(Math.toRadians(angle + 90))));
		g2.setStroke(new BasicStroke());
	
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
         double delta = (int)Math.round(y)
        		 ;
         currPoint = new Point((int)Math.round(x) + point.x, (int) (((int)Math.round(y) + point.y) - 2*delta));
         if (currPoint.getX() < 0.0) {
        	 currPoint.x = 0;
         }
         if (currPoint.getY() < 0.0) {
        	 currPoint.y = 0;
         }
         if (currPoint.getX() > 1000) {
        	 currPoint.x = 1000;
         }
         if (currPoint.getY() > 600) {
        	 currPoint.y = 600;
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
