package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Game.Game;

public class NextRoundPanel extends JFrame {
	private JLabel score;
	private JLabel shotsTaken;
	private JLabel message;
	private JLabel velocityLabel;
	private JButton nextRound;
	private JButton endGame;
	private Game ourGame;
	
	public NextRoundPanel(Game g, JLabel velocityLabel) {
		ourGame = g;
		this.velocityLabel = velocityLabel;
		setSize(new Dimension(200, 300));
		setTitle("Round Complete");
		setLayout(new GridLayout(0, 1));
		
		// Hit or Miss?
		message = new JLabel();
		if (ourGame.getTarget().isHit()) {
			message.setText(" You hit the cake!");
		} else {
			message.setText(" You missed the cake.");
		}
		add(message);
		
		// Display Score
		score = new JLabel();
		score.setText(" Your Current Score Is: " + ourGame.getTarget().getScore());
		add(score);
		
		// Display Shots Taken
		shotsTaken = new JLabel();
		shotsTaken.setText(" You've Taken " + ourGame.getLauncher().getShotsTaken() + " Shots So Far!");
		add(shotsTaken);
		
		// Option for Next Round
		nextRound = new JButton();
		nextRound.setText("Next Round?");
		add(nextRound);
		
		// Option for End Game
		endGame = new JButton();
		endGame.setText("End Game?");
		add(endGame);
		
		// Button Listeners
		nextRound.addActionListener(new NextRoundListener());
		endGame.addActionListener(new EndGameListener());
	}
	
	
	private class NextRoundListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ourGame.getLauncher().getMissile().pickRandomVelocity();
			ourGame.getLauncher().getMissile().setDefaults();
			velocityLabel.setText("Current Velocity: " + ourGame.getLauncher().getMissile().getVelocity());
			repaint();
			setVisible(false);
		}
	}
	
	private class EndGameListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
}