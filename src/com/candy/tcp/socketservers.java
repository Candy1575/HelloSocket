package com.candy.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//基于tcp的soket协议通信实现用户登录
//服务器端

public class socketservers {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(8889);
			System.out.println("---------server beigning");
			Socket socket = serverSocket.accept();
			InputStream is = socket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(is);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String datas = bufferedReader.readLine();
			while (datas != null) {
				System.out.println(datas);
				datas = bufferedReader.readLine();

			}
			socket.shutdownInput();

			OutputStream osOutputStream = socket.getOutputStream();
			OutputStreamWriter oWriter = new OutputStreamWriter(osOutputStream, "utf-8");
			BufferedWriter bufferedWriter = new BufferedWriter(oWriter);
			bufferedWriter.write("456");
			bufferedWriter.flush();

			socket.shutdownOutput();

			bufferedWriter.close();
			oWriter.close();
			osOutputStream.close();

			bufferedReader.close();
			inputStreamReader.close();
			is.close();
			socket.close();
			serverSocket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
