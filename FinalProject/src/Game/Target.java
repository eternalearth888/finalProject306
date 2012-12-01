/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
	
	public void reset() {
		score = 0;
		hit = false;		
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		//top layer
		Color topColor = new Color(218,112,214);
		g2.setColor(topColor);
		g2.fillRect(925, 470, 75, 50);

		//middle layer
		Color middleColor = new Color(186,85,211);
		g2.setColor(middleColor);
		g2.fillRect(900, 510, 125, 50);

		//bottom layer
		Color bottomColor = new Color(153,50,204);
		g2.setColor(bottomColor);
		g2.fillRect(890, 560, 150, 75);

		//strawberries
		Color berryColor = new Color(205, 0, 0);
		g2.setColor(berryColor);
		g2.fillOval(900, 540, 20, 20);
		g2.fillOval(935, 540, 20, 20);
		g2.fillOval(970, 540, 20, 20);
		g2.fillOval(1005, 540, 20, 20);
	};
	
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
