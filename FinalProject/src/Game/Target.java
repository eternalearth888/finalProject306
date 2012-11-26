/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Graphics;

public class Target extends Structure {
	private boolean hit;
	private int score;
	private Hint hint;
	private int hintIndex;
	
	public Target() {
		score = 0;
		hit = false;
		hint = new Hint();	
	};
	
	@Override
	public void draw(Graphics g) {};
	
	public void incrementScore() {
		if (hit == true) {
			score = score + 42;
		}
	};	//increment by 42
	
	public void displayHint() {}

	public Hint getHint() {
		return hint;
	}

	public void setHint(Hint hint) {
		this.hint = hint;
	}

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
