package ru.lksi.cse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
		Socket socket;
		ServerSocket serversocket;
		ObjectOutputStream output;
		ObjectInputStream input;
	
	public static void main(String[] args) {
		
	}

	public void run() {
		try {
			ServerSocket serversocket = new ServerSocket (5678, 5);
			while (true) {
				socket = serversocket.accept();
				input = new ObjectInputStream (socket.getInputStream());
				output = new ObjectOutputStream (socket.getOutputStream());
				output.writeObject("Вы ввели: " + (String)input.readObject());
			}
		} catch (IOException e) {e.printStackTrace();
		} catch (ClassNotFoundException e) {e.printStackTrace();}
	}

}
