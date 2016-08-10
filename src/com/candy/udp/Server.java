package com.candy.udp;

import java.net.DatagramSocket;

public class Server {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(8889);
		ServerThread thread = new ServerThread(socket);
		thread.start();

	}
}
