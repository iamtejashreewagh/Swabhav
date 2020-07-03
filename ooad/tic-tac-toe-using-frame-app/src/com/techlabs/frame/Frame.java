package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Frame extends JFrame  {
	public Frame() {

	}
	
	public void start() {
		
		JLabel playerOneLabel = new JLabel();
		playerOneLabel.setText("Enter player 1 name");
		playerOneLabel.setBounds(200, 0, 200, 100);
		add(playerOneLabel);
		JTextField textFieldForPLayerOne = new JTextField();
		textFieldForPLayerOne.setBounds(170, 60, 200, 50);
		add(textFieldForPLayerOne);
		
		JLabel playerTwoLabel = new JLabel();
		playerTwoLabel.setText("Enter player 2 name");
		playerTwoLabel.setBounds(200, 120, 200, 100);
		add(playerTwoLabel);
		JTextField textFieldForPLayerTwo = new JTextField();
		textFieldForPLayerTwo.setBounds(170, 180, 200, 50);
		add(textFieldForPLayerTwo);
		
		JButton proceedButton =new JButton("Proceed");
		proceedButton.setBounds(370,400, 100, 50);
		add(proceedButton);
		
		proceedButton.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	String playerOneName = textFieldForPLayerOne.getText();
		    	String playerTwoName = textFieldForPLayerTwo.getText();
		    	MainFrame frame = new MainFrame(playerOneName, playerTwoName);
		    	frame.setVisible(true);
		    	dispose();
		    }
		});
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
}