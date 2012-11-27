package GUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class ScreenPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

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

		//slingshot
		Color slingColor = new Color(160, 82, 45);
		g2.setColor(slingColor);
		g2.fillRect(70, 530, 20, 100);

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


	}

}
