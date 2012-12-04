/* Deslis, Shpurik, Hetrick, Combs
 * Last Updated: 12/3/12
 * 
 */
package Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JOptionPane;

public class Hint {
	private ArrayList<String> hints;
	private String returnedHint;
	
	public Hint() {
		hints = new ArrayList<String>();
		hints.add("The closer the angle is to 90 degrees, the greater the peak of its motion");
		hints.add("To calculate the horizontal velocity, multiply velocity by cos(angle in radians)!");
		hints.add("In real life situations, With constant acceleration, the distance traveled is equal to average velocity * time.");
		hints.add("The closer the angle to 0 degrees, the lower its peak of motion.");
		hints.add("The launch speed, angle, and the value of gravity determines the position and velocity at any time");
		hints.add("Make sure to break the velocity down into horizonatal and vertical components, using cos and sin of your angle respectively");
		hints.add("Don't fret! If you are unsure of your solution, it may be beneficial to sacrifice some health to visually see if your calculation is correct");
		hints.add("Pick many time values and plot the horizonatal and vertical values until you can define the trajectory the missile at your angle will travel");
		hints.add("The equation for distance traveled is distance = velocity*sin(angle)/gravity");
		hints.add("Remember that the trajectory of a perfect projectile (over a flat surface without air resistance) is shaped as a parabola");
		returnedHint = "";
	}
	
	public String pickRandomHint() {
		Collections.shuffle(hints);
		Random rand = new Random();
		int index = rand.nextInt(10);
		return hints.get(index);
	}
	public ArrayList<String> getHints() {
		return hints;
	}
	public void setHints(ArrayList<String> hints) {
		this.hints = hints;
	}
	public String getReturnedHint() {
		return returnedHint;
	}

	public void setReturnedHint(String returnedHint) {
		this.returnedHint = returnedHint;
	}

	//list of 10+ hints
	
}
