package GUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import Game.Game;

public class ButtonPanel extends JPanel{
	private JLabel scoreLabel = new JLabel();
	private JLabel shotsTakenLabel = new JLabel();
	private JLabel velocityLabel = new JLabel();
	public ButtonPanel(Game ourGame) {
		setLayout(new GridLayout(0,1));
		Border borderTurn = BorderFactory.createEtchedBorder();
		//display angle input box
		InputPanel inputPanel = new InputPanel(ourGame);
		inputPanel.setBorder(borderTurn);
		add(inputPanel);
		//display velocity 
		velocityLabel.setBorder(borderTurn);
		velocityLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		velocityLabel.setText("Current Velocity: " + ourGame.getLauncher().getMissile().getVelocity());
		add(velocityLabel);
		
		//display score
		scoreLabel.setBorder(borderTurn);
		scoreLabel.setFont(new Font("Algerian", Font.PLAIN , 16));
		scoreLabel.setText("Score: " + ourGame.getTarget().getScore());
		add(scoreLabel);
		
		//display shots taken
		shotsTakenLabel.setBorder(borderTurn);
		shotsTakenLabel.setFont(new Font("Algerian", Font.PLAIN , 16));
		shotsTakenLabel.setText("Shots Taken: " + ourGame.getLauncher().getShotsTaken());
		add(shotsTakenLabel);		
		
		//launch button
		JButton launchButton = new JButton("Launch!!!");
		launchButton.setFont(new Font("Algerian", Font.PLAIN , 40));
		add(launchButton);
		launchButton.addActionListener(new LaunchButtonListener());
		
		//hint button
		JButton hintButton = new JButton("Give me a hint");
		hintButton.setFont(new Font("Algerian", Font.PLAIN, 20));
		add(hintButton);
		hintButton.addActionListener(new HintButtonListener());
		
		//create white space
		JLabel whiteSpaceLabel = new JLabel();
		add(whiteSpaceLabel);
		
		//reset button
		JButton newGameButton = new JButton("New Game");
		newGameButton.setFont(new Font("Algerian", Font.PLAIN , 16));
		add(newGameButton);
		newGameButton.addActionListener(new NewGameButtonListener());
		

	}
	private class LaunchButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
	private class NewGameButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
	private class HintButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}
