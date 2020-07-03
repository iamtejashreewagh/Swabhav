package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.techlab.model.Board;
import com.techlab.model.Game;
import com.techlab.model.Mark;
import com.techlab.model.Player;
import com.techlab.model.ResultAnalyzer;

public class MainFrame extends JFrame {
	Board board;
	ResultAnalyzer resultAnalyzer;
	Player[] players;
	Game game;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JLabel playerLabel;
	JLabel statusLabel;

	public MainFrame(String playerOneName, String playerTwoName) {
		board = new Board();
		resultAnalyzer = new ResultAnalyzer(board);
		players = new Player[2];
		players[0] = new Player(playerOneName, Mark.X);
		players[1] = new Player(playerTwoName, Mark.O);
		game = new Game(players, board, resultAnalyzer);

		button1 = new JButton("1");
		button1.setBounds(0, 150, 100, 50);
		button1.setBackground(Color.WHITE);
		add(button1);

		button2 = new JButton("2");
		button2.setBounds(200, 150, 100, 50);
		button2.setBackground(Color.WHITE);
		add(button2);

		button3 = new JButton("3");
		button3.setBounds(400, 150, 100, 50);
		button3.setBackground(Color.WHITE);
		add(button3);

		button4 = new JButton("4");
		button4.setBounds(0, 250, 100, 50);
		button4.setBackground(Color.WHITE);
		add(button4);

		button5 = new JButton("5");
		button5.setBounds(200, 250, 100, 50);
		button5.setBackground(Color.WHITE);
		add(button5);

		button6 = new JButton("6");
		button6.setBounds(400, 250, 100, 50);
		button6.setBackground(Color.WHITE);
		add(button6);

		button7 = new JButton("7");
		button7.setBounds(0, 350, 100, 50);
		button7.setBackground(Color.WHITE);
		add(button7);

		button8 = new JButton("8");
		button8.setBounds(200, 350, 100, 50);
		button8.setBackground(Color.WHITE);
		add(button8);

		button9 = new JButton("9");
		button9.setBounds(400, 350, 100, 50);
		button9.setBackground(Color.WHITE);
		add(button9);

		statusLabel = new JLabel();
		statusLabel.setText("Status:-" + game.getStatus());
		statusLabel.setBounds(0, 0, 150, 100);
		add(statusLabel);

		playerLabel = new JLabel();
		playerLabel.setText("Current Player:-" + game.getCurrentPlayer().getName());
		playerLabel.setBounds(200, 0, 200, 100);
		add(playerLabel);

		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		initializeMainFrame();
	}

	public void initializeMainFrame() {
			
			button1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(0);
					button1.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});
			button2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(1);
					button2.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			button3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(2);
					button3.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			button4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(3);
					button4.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			button5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(4);
					button5.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			button6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(5);
					button6.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			button7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(6);
					button7.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			button8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(7);
					button8.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});
			button9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(8);
					button9.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					playerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});
			
			}
	public void checkStatus() {
		if(!game.getStatus().equals("In Progress")) {
			button2.setVisible(false);
			button1.setVisible(false);
			button3.setVisible(false);
			button4.setVisible(false);
			button5.setVisible(false);
			button6.setVisible(false);
			button7.setVisible(false);
			button8.setVisible(false);
			button9.setVisible(false);
			playerLabel.setText(game.getNextPlayer().getName()+"Won!!");
		}
	}
}
