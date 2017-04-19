package ru.lksi.Swing1;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class Window extends JFrame {
	private JTextField textField;
	Window () {
		setResizable(false);
		setVisible (true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setSize (800, 600);
		setLocationRelativeTo (null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 794, 571);
		getContentPane().add(scrollPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setEditable(false);
		textField.setText("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		scrollPane.setViewportView(textField);
		//textField.setColumns(10);
	}
}
