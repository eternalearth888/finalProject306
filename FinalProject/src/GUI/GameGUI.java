package GUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import Game.Game;

public class GameGUI extends JFrame{
	private Game ourGame = new Game();
	public GameGUI() {
		setSize(new Dimension(1400, 750));
		setTitle("Missile Shooter");
		ScreenPanel sPanel = new ScreenPanel();
		Border borderTurn = BorderFactory.createEtchedBorder();
		sPanel.setBorder(borderTurn);
		add(sPanel, BorderLayout.CENTER);
		ButtonPanel bPanel = new ButtonPanel(ourGame);
		add(bPanel, BorderLayout.WEST);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
	}
	
	private JMenu createFileMenu()
	{
		JMenu menu = new JMenu("File"); 
		menu.add(createFileExitItem());
		return menu;
	}
	private JMenuItem createFileExitItem()
	{
		JMenuItem item = new JMenuItem("Exit");
		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		}
		item.addActionListener(new MenuItemListener());
		return item;
	}


	public static void main(String[] args) {
	  GameGUI gui = new GameGUI();
	  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  gui.setVisible(true);
	  //JOptionPane.showMessageDialog(gui, "Welcome to ...", "X Squared Over Four", JOptionPane.INFORMATION_MESSAGE);
	}

}
