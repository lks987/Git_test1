package ru.lksi.Swing1;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.Choice;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Window extends JFrame {
	
	Window () {
		setResizable(false);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setSize (800, 600);
		setLocationRelativeTo (null);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 36, 764, 514);
		getContentPane().add(tabbedPane);
		JPanel panel1 = new JPanel ();
		JPanel panel2 = new JPanel ();
		tabbedPane.addTab("Tab1", panel1);
		panel1.setLayout(null);
		
		JButton btnGetUrlImage = new JButton("Get URL Image");
		btnGetUrlImage.setBounds(10, 11, 105, 23);
		panel1.add(btnGetUrlImage);
		
		JButton btnGetFile = new JButton("Get File");
		btnGetFile.setBounds(660, 11, 89, 23);
		panel1.add(btnGetFile);
		
		JTextArea txtrEnterImageUrl = new JTextArea();
		txtrEnterImageUrl.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrEnterImageUrl.setText("Enter Image URL here...");
		txtrEnterImageUrl.setBounds(10, 45, 739, 421);
		panel1.add(txtrEnterImageUrl);
		tabbedPane.addTab("Tab2", panel2);
		panel2.setLayout(null);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(10, 11, 89, 23);
		panel2.add(btnView);
		
		JLabel lblFormat = new JLabel("Format:");
		lblFormat.setBounds(611, 15, 46, 14);
		panel2.add(lblFormat);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(667, 12, 82, 20);
		comboBox.addItem("png");
		comboBox.addItem("jpeg");
		panel2.add(comboBox);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnOptions.add(mntmExit);
		
		
		
		setVisible (true);
	}
}
