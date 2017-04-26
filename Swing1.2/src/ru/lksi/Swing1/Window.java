package ru.lksi.Swing1;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
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
		
		JButton btnGetFile = new JButton("Get File");
		btnGetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				int returnVal = chooser.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					try {
						First.setImage(ImageIO.read(chooser.getSelectedFile()));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnGetFile.setBounds(660, 11, 89, 23);
		panel1.add(btnGetFile);
		
		JTextArea txtrEnterImageUrl = new JTextArea();
		txtrEnterImageUrl.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrEnterImageUrl.setText("Enter Image URL here...");
		txtrEnterImageUrl.setBounds(10, 45, 739, 421);
		panel1.add(txtrEnterImageUrl);
		tabbedPane.addTab("Tab2", panel2);
		panel2.setLayout(null);
		
		JButton btnGetUrlImage = new JButton("Get URL Image");
		btnGetUrlImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					URL url = new URL (txtrEnterImageUrl.getText());
					First.setImage(ImageIO.read(url));
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Invalid URL or internet connection failed");
					//e.printStackTrace();
				}
			}
		});
		btnGetUrlImage.setBounds(10, 11, 122, 23);
		panel1.add(btnGetUrlImage);
		
		JLabel lblFormat = new JLabel("Format:");
		lblFormat.setBounds(611, 15, 46, 14);
		panel2.add(lblFormat);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 739, 432);
		panel2.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblImagelabel = new JLabel("");
		panel.add(lblImagelabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(667, 12, 82, 20);
		comboBox.addItem("png");
		comboBox.addItem("jpg");
		panel2.add(comboBox);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (First.getImage() == null) {return;}
				lblImagelabel.setIcon(new ImageIcon(First.getImage()));
				lblImagelabel.updateUI();
			}
		});
		
				
		btnView.setBounds(10, 11, 89, 23);
		panel2.add(btnView);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSaveImage = new JMenuItem("Save Image");
		mntmSaveImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int returnVal = chooser.showSaveDialog(null);
				File file = chooser.getSelectedFile();
				if (file == null) {return;};
				String filePath = file.getAbsolutePath();
				if ((String) comboBox.getSelectedItem() == "png") {
					file = new File (filePath + ".png");
					chooser.setSelectedFile(file);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						First.saveImage((String) comboBox.getSelectedItem(), file);
					}
				}
				if ((String) comboBox.getSelectedItem() == "jpg") {
					file = new File (filePath + ".jpg");
					chooser.setSelectedFile(file);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						First.saveImage((String) comboBox.getSelectedItem(), file);
					}
				}
			}
		});
		mnFile.add(mntmSaveImage);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnOptions.add(mntmExit);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		setVisible (true);
	}
}
