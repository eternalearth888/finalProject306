/* Deslis, Shpurik, Hetrick, Combs
 * Last Updated: 12/3/12
 * 
 */
package Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Target extends Structure {
	private boolean hit;
	private int score;
	private Hint hint;
	private int hintIndex; // determines hint being shown to screen
	private int cakeSize;  // keeps track of how many cake layers left
	
	public Target() {
		score = 0;
		hit = false;
		hint = new Hint();
		cakeSize = 4;
	};
	
	public void reset() {
		score = 0;
		hit = false;
		cakeSize = 4;
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		//candle wax
		if(cakeSize == 4) {
			Color candleColor = new Color(255,250,205);
			g2.setColor(candleColor);
			g2.fillRoundRect(950, 410, 25, 65, 15, 15);
			
			//candle light
			Color lightColor = new Color(255,140,0);
			g2.setColor(lightColor);
			g2.fillOval(952,370,20,40);
		}
		
		//top layer
		if (cakeSize >= 3) {
			Color topColor = new Color(218,112,214);
			g2.setColor(topColor);
			g2.fillRoundRect(925, 470, 75, 50, 15, 15);
		}

		//middle layer
		if (cakeSize >= 2) {
			Color middleColor = new Color(186,85,211);
			g2.setColor(middleColor);
			g2.fillRoundRect(900, 510, 125, 50, 15, 15);
		}

		//bottom layer
		if (cakeSize >= 1) {
			Color bottomColor = new Color(153,50,204);
			g2.setColor(bottomColor);
			g2.fillRoundRect(890, 560, 150, 75, 15, 15);
	
			//strawberries
			Color berryColor = new Color(205, 0, 0);
			g2.setColor(berryColor);
			g2.fillOval(900, 540, 20, 20);
			g2.fillOval(935, 540, 20, 20);
			g2.fillOval(970, 540, 20, 20);
			g2.fillOval(1005, 540, 20, 20);
		}
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
	
	public int getCakeSize() {
		return cakeSize;
	}

	public void decCakeSize() {
		cakeSize--;
	}
}
