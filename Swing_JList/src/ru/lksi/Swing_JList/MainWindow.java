package ru.lksi.Swing_JList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainWindow extends JFrame {
	private JTextField txtPleaseEnterYour;

	public MainWindow(String s) {
		super(s);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setResizable (false);
		setSize (800,600);
		setLocationRelativeTo (null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 10, 400, 550);
		getContentPane().add(scrollPane);
		
		ListModel model = new ListModel ();
		
		for (int i = 0; i < 10; i++) {
			model.addItem("Hello World" + " " + i);
		}
		JList<String> list = new JList<String>(model);
		scrollPane.setViewportView(list);
		
		txtPleaseEnterYour = new JTextField();
		txtPleaseEnterYour.setText("Please, enter your string item here...");
		txtPleaseEnterYour.setBounds(415, 43, 369, 20);
		getContentPane().add(txtPleaseEnterYour);
		txtPleaseEnterYour.setColumns(10);
		
		JButton btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List <String> selItems = list.getSelectedValuesList();
				if (selItems.size() > 1) {
					for (String s: selItems) {
						model.delItem(s);
					}
					list.setSelectedIndex(0);
				} else {
					model.delItem(list.getSelectedValue());
				}		
				list.updateUI();
			}
		});
		btnDeleteItem.setBounds(415, 11, 117, 23);
		getContentPane().add(btnDeleteItem);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = txtPleaseEnterYour.getText();
				model.addItem(s);
				list.updateUI();
			}
		});
		btnAddItem.setBounds(415, 74, 117, 23);
		getContentPane().add(btnAddItem);
		
		
		
		
		
		setVisible (true);
	}
}
