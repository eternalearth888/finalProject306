package GUI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class StoryPanel extends JFrame {

	/*
	Young Mint Pudding, a charming pony full of heart with a big appetite, 
	sees the glorious strawberry cake crafted by the best bakers in all of 
	the land one day as she trots home. Against the better judgment of her 
	friends (and her own common sense) she decides that she has to launch 
	herself from a catapult in order to consume the cake. So, Mint Pudding 
	risks her life to catapult with your help (and immense knowledge of 
	angles and trajectories) and hopefully hit the glorious cake of strawberry. 
	With each successful launch on the cake, Mint Pudding will devour a layer 
	of the cake (she has a VERY big mouth), but with each failed attempt, she 
	will lose a portion of her health. If she fails to consume all of the cake 
	before her health is depleted, little Mint Pudding will not see the next sunrise�
	*/
	
	public StoryPanel() {
		setSize(new Dimension(600, 400));
		setResizable(false);
		setTitle("Background Story");
		
		JTextArea story = new JTextArea("\nYoung Mint Pudding, a charming pony full of heart with a big appetite, \nsees the " +
				"glorious strawberry cake crafted by the best bakers \nin all of the land one day as she trots " +
				"home. Against the better \njudgment of  her friends (and her own common sense) she decides that she \nhas " +
				"to launch herself from a catapult in order to consume \nthe cake. So, Mint Pudding risks her life to " +
				"catapult with your help (and \nimmense knowledge of angles and trajectories) and hopefully hit the glorious \n" +
				"cake of strawberry. With each successful launch on the cake, \nMint Pudding will devour a layer of the cake " +
				"(she \nhas a VERY big mouth), but with each failed attempt, she will lose \na portion of her health. " +
				"If she fails to consume all \nof the cake before her health is depleted, little Mint Pudding will not see \nthe next sunrise�");
		story.setBorder(new TitledBorder(new EtchedBorder(), "Background Story"));
		story.setLineWrap(true);
		story.setEditable(false);
		story.setFont(new Font("Arial", Font.PLAIN, 16));
		add(story);
	}
}