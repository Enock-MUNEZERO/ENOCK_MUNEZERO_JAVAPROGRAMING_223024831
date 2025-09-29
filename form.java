package com.registor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class form implements ActionListener {
	
	JFrame frame;
	JLabel name=new JLabel("Names");
	JLabel username=new JLabel("UserName");
	JLabel pasword=new JLabel("Password");
	JTextField ntxt =new JTextField();
	JTextField utxt =new JTextField();
	JPasswordField ptxt=new JPasswordField();
	JButton register=new JButton("Register");
	JButton reset=new JButton("reset");
	
	
	public form() {
		CreateWindow();
		setLocationAndSize();
		addComponentsToFrame();
		//addActionEvent();
		
	}
	
	

	private void setLocationAndSize() {
		//name
		name.setBounds(10, 10, 100, 30);
		ntxt.setBounds(120, 10, 200, 30);
		//username
		username.setBounds(10, 50, 100,30);
		utxt.setBounds(120, 50, 200, 30);
		//password
		pasword.setBounds(10, 90, 100, 30);
		ptxt.setBounds(120,90, 200, 30);
		//buttons
		register.setBounds(50, 130, 120, 30);
		reset.setBounds(180, 130, 130, 30);
		
		
	}



	private void addComponentsToFrame() {
		frame.add(name);
		frame.add(username);
		frame.add(pasword);
		frame.add(ntxt);
		frame.add(utxt);
		frame.add(ptxt);
		frame.add(register);
		frame.add(reset);
		
	}



	private void CreateWindow() {
		
		frame = new JFrame();
		frame.setTitle("++FILL DESCRIPTION++");
		frame.setBounds(10, 10, 450, 300);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}