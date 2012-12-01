package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Scenery {
	public void draw(Graphics g) {
		 Graphics2D g2 = (Graphics2D)g;
		
		//background
		Color skyColor = new Color(135, 206, 250);
		g2.setColor(skyColor);
		g2.fillRect(0, 0, 1080, 750);

		//grass
		Color grassColor = new Color(34, 139, 34);
		g2.setColor(grassColor);
		g2.fillRect(0, 550, 1080, 180);

		//sun
		Color sunColor = new Color(255, 215, 0);
		g2.setColor(sunColor);
		g2.fillOval(50, 50, 100, 100);

		//cloud1
		g2.setColor(Color.white);
		g2.fillOval(90, 120, 50, 50);
		g2.fillOval(120, 110, 50, 50);
		g2.fillOval(150, 110, 50, 50);
		g2.fillOval(120, 130, 50, 50);
		g2.fillOval(150, 130, 50, 50);
		g2.fillOval(180, 120, 50, 50);

		//cloud2
		g2.fillOval(300, 50, 50, 50);
		g2.fillOval(330, 40, 50, 50);
		g2.fillOval(360, 40, 50, 50);
		g2.fillOval(330, 60, 50, 50);
		g2.fillOval(360, 60, 50, 50);
		g2.fillOval(390, 50, 50, 50);

		//cloud3
		g2.fillOval(500, 120, 50, 50);
		g2.fillOval(530, 110, 50, 50);
		g2.fillOval(560, 110, 50, 50);
		g2.fillOval(530, 130, 50, 50);
		g2.fillOval(560, 130, 50, 50);
		g2.fillOval(590, 120, 50, 50);

		//cloud4
		g2.fillOval(700, 50, 50, 50);
		g2.fillOval(730, 40, 50, 50);
		g2.fillOval(760, 40, 50, 50);
		g2.fillOval(730, 60, 50, 50);
		g2.fillOval(760, 60, 50, 50);
		g2.fillOval(790, 50, 50, 50);

		//cloud5
		g2.fillOval(900, 120, 50, 50);
		g2.fillOval(930, 110, 50, 50);
		g2.fillOval(960, 110, 50, 50);
		g2.fillOval(930, 130, 50, 50);
		g2.fillOval(960, 130, 50, 50);
		g2.fillOval(990, 120, 50, 50);
	}
}
