package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private JButton red;
	private JButton green;
	private JPanel panel;

	public MainFrame() {
		this.setVisible(true);
		this.setSize(500,500);
		panel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		red = new JButton("Red");
		green = new JButton("Green");
		panel.add(red);
		panel.add(green);
		panel.setBackground(Color.GRAY);
		this.add(panel);
		red.addActionListener(new CommonListener(this));
		green.addActionListener(new CommonListener(this));
	}
	
	public JButton getRedButton() {
		return red;
	}
	
	public JButton getGreenButton() {
		return green;
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
}
