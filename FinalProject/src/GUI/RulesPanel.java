package GUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class RulesPanel extends JFrame {

	public RulesPanel() {
		setSize(new Dimension(600, 600));
		setResizable(false);
		setTitle("Rules / How to Play");
		
		JTextArea story = new JTextArea("\nRULES:\n" +
				"Take a look at the velocity, and choose an angle that will \nresult in a successful hit of the cake." +
				"\n\nBe sure to save your angle before you launch, or the angle will not be changed, \nand Mint Pudding " +
				"will be catapulted at an angle of Zero degrees. \n\nWhen you�re happy with your saved angle, be sure to click launch and \ntest your abilities!" +
				"\n\nAt the end of each round, the angle will reset to zero, and \nyou�ll have to pick a new one." +
				"\n\nRecommended materials:" +
				"\nPaper (to visualize the calculation)" +
				"\nPencil (to draw :P)" +
				"\nEraser (should you choose  to make mistakes)" +
				"\nCalculator (unless you can do trig in your head)" +
 
				"\n\nREMEMBER, if you need extra help throughout the game, you can ask for a hint \nby pressing �give me a hint�. " +
				"\n\nTHERE IS NO PENALTY FOR ASKING A HINT!");
		story.setBorder(new TitledBorder(new EtchedBorder(), "Rules / How to Play"));
		story.setLineWrap(true);
		story.setEditable(false);
		story.setFont(new Font("Arial", Font.PLAIN, 16));
		add(story);
	}
}