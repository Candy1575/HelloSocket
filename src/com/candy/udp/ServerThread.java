package com.candy.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerThread extends Thread {
	DatagramSocket socket;

	public ServerThread(DatagramSocket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[1024];
		DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
		try {
			socket.receive(packet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String info = new String(bytes, 0, packet.getLength());
		System.out.println("-------server--------");
		System.out.println("=======Client======" + info + "=========");
	
		InetAddress address=packet.getAddress();
		int port=packet.getPort();
		byte[] data="welcome  to server====".getBytes();
		DatagramPacket packet2=new DatagramPacket(data, data.length,address,port);
		try {
			socket.send(packet2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		socket.close();
	
	}
}
