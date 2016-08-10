package com.candy.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	public static void main(String[] args) throws Exception {
		InetAddress inetAddress=InetAddress.getByName("localhost");
		int port=8889;
		byte[] datas="name:admin====password：123".getBytes();
		DatagramPacket packet=new DatagramPacket(datas, datas.length,inetAddress,port);
		DatagramSocket socket=new DatagramSocket();
		socket.send(packet);
		
		
		byte[] bytes=new byte[1024];
		DatagramPacket packet2=new DatagramPacket(bytes, bytes.length);
		socket.receive(packet2);
		String string=new String(bytes, 0, packet2.getLength());
		System.out.println("---=======Server say ====="+string);
		
		
		
		socket.close();
		
		
	}
}
