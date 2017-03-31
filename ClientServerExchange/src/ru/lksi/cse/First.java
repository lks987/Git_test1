package ru.lksi.cse;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class First extends JFrame implements Runnable {
	JTextField t1;
	JButton b1;
	Socket socket;
	ObjectOutputStream output;
	ObjectInputStream input;
	
	public static void main (String[] args) {
		new Thread(new First("G-гурда")).start();
		new Thread(new Server()).start();
	}
	public First (String name) {
		super (name);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setLayout (new FlowLayout());
		JTextField t1 = new JTextField ("¬ведите какую-нибудь хуйню");
		JButton b1 = new JButton ("SEND");
		add(t1);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==b1) {
					sendData(t1.getText());
				}
			}
		});
	}		
	public void run() {
		try {
			while (true) {
				Socket socket = new Socket (InetAddress.getByName("127.0.0.1"), 5678);
				output = new ObjectOutputStream (socket.getOutputStream());
				input = new ObjectInputStream (socket.getInputStream());
				JOptionPane.showMessageDialog(null, (String)input.readObject());
			}
		} catch (IOException e) {e.printStackTrace();
		} catch (HeadlessException e) {e.printStackTrace();
		} catch (ClassNotFoundException e) {e.printStackTrace();}
	}
	public void sendData (Object obj) {
		try {
			output.flush();
			output.writeObject(obj);
		} catch (IOException e) {};
		
	}

}
