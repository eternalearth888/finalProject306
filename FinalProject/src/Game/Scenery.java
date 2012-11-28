package Game;

import java.awt.Color;
import java.awt.Graphics;

public class Scenery {
	public void draw(Graphics g) {
		//background
		Color skyColor = new Color(135, 206, 250);
		g.setColor(skyColor);
		g.fillRect(0, 0, 1080, 750);

		//grass
		Color grassColor = new Color(34, 139, 34);
		g.setColor(grassColor);
		g.fillRect(0, 550, 1080, 180);

		//sun
		Color sunColor = new Color(255, 215, 0);
		g.setColor(sunColor);
		g.fillOval(50, 50, 100, 100);

		//cloud1
		g.setColor(Color.white);
		g.fillOval(90, 120, 50, 50);
		g.fillOval(120, 110, 50, 50);
		g.fillOval(150, 110, 50, 50);
		g.fillOval(120, 130, 50, 50);
		g.fillOval(150, 130, 50, 50);
		g.fillOval(180, 120, 50, 50);

		//cloud2
		g.fillOval(300, 50, 50, 50);
		g.fillOval(330, 40, 50, 50);
		g.fillOval(360, 40, 50, 50);
		g.fillOval(330, 60, 50, 50);
		g.fillOval(360, 60, 50, 50);
		g.fillOval(390, 50, 50, 50);

		//cloud3
		g.fillOval(500, 120, 50, 50);
		g.fillOval(530, 110, 50, 50);
		g.fillOval(560, 110, 50, 50);
		g.fillOval(530, 130, 50, 50);
		g.fillOval(560, 130, 50, 50);
		g.fillOval(590, 120, 50, 50);

		//cloud4
		g.fillOval(700, 50, 50, 50);
		g.fillOval(730, 40, 50, 50);
		g.fillOval(760, 40, 50, 50);
		g.fillOval(730, 60, 50, 50);
		g.fillOval(760, 60, 50, 50);
		g.fillOval(790, 50, 50, 50);

		//cloud5
		g.fillOval(900, 120, 50, 50);
		g.fillOval(930, 110, 50, 50);
		g.fillOval(960, 110, 50, 50);
		g.fillOval(930, 130, 50, 50);
		g.fillOval(960, 130, 50, 50);
		g.fillOval(990, 120, 50, 50);
	}
}
