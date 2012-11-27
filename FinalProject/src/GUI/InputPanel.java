package GUI;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import Game.Game;


public class InputPanel extends JPanel {
	private JTextField angleTextField = new JTextField();
	private Game g; 
	public InputPanel(Game ourGame) {
		setLayout(new GridLayout(0,1));
		g = ourGame;
		JLabel label = new JLabel("Enter an angle between 0 and 360: ");
		label.setFont(new Font("Algerian", Font.ITALIC, 16));
		add(label);
		angleTextField.setFont(new Font("Algerian", Font.PLAIN, 16));
		add(angleTextField);
	}
}
