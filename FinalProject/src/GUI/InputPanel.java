package GUI;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Game.Game;


public class InputPanel extends JPanel {
	private JTextField angleTextField = new JTextField();
	private JLabel angle;
	private Game ourGame; 
	public InputPanel(Game g) {
		setLayout(new GridLayout(0,1));
		ourGame = g;
		angle = new JLabel(" " + ourGame.getLauncher().getMissile().getAngle());
		angle.setFont(new Font("Algerian", Font.ITALIC, 16));
		add(angle);
		JLabel label = new JLabel("Enter an angle between 0 and 360: ");
		label.setFont(new Font("Algerian", Font.ITALIC, 16));
		add(label);
		angleTextField.setFont(new Font("Algerian", Font.PLAIN, 16));
		add(angleTextField);
		//launch button
		JButton saveButton = new JButton("Save New Angle");
		saveButton.setFont(new Font("Algerian", Font.PLAIN , 16));
		add(saveButton);
		saveButton.addActionListener(new saveButtonListener());
	}
	
	public void update() {
		angle.setText(" " + ourGame.getLauncher().getMissile().getAngle());
		angleTextField.setText("");
	}
	
	private class saveButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String newAngleStr = angleTextField.getText();
			try {
				double newAngle = Double.parseDouble(newAngleStr);
				ourGame.getLauncher().getMissile().pickAngle(newAngle);
				update();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid Angle: " + newAngleStr);
			}
		}
	}
}