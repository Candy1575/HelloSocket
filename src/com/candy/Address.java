package com.candy;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Address {
	public static void main(String[] args) throws UnknownHostException {
		//获取本地的InetAddress实例
		InetAddress address=InetAddress.getLocalHost();
		
		System.out.println("计算机名"+address.getHostName());
		System.out.println("IP地址"+address.getHostAddress());;
		byte[] bytes=address.getAddress();
		System.out.println("字节数组形式的IP"+Arrays.toString(bytes));
		System.out.println(address);
		
		//根据机器名获取InetAddress实例
		InetAddress address2=InetAddress.getByName("Candy");
		
	}
}
