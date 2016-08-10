package com.candy;

import java.net.MalformedURLException;
import java.net.URL;

public class Url {
		public static void main(String[] args) {
			try {
				URL imooc=new URL("http://www.imooc.com");
				URL url=new URL(imooc,"/index.html?username=tom#test");//?表示参数
				System.out.println("协议"+url.getProtocol());
				System.out.println("主机"+url.getHost());
				System.out.println("端口号"+url.getPort()); //如果未指定端口号，则使用默认的端口号，此时getPort（）方法返回值为-1
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
