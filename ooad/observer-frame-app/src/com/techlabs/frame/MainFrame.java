package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		EmailListener emailListener = new EmailListener();
		SmsListener smsListener = new SmsListener();
		JButton button = new JButton("Order");
		button.setBounds(200, 200, 100, 100);
		add(button);
		
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		
		button.addActionListener(emailListener);
		button.addActionListener(smsListener);
	}

}
