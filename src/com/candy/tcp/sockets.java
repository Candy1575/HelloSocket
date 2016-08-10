package com.candy.tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class sockets {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 8889);
			OutputStream oStream = socket.getOutputStream();
			OutputStreamWriter or = new OutputStreamWriter(oStream);
			PrintWriter pWriter = new PrintWriter(or);
			pWriter.write("123");
			pWriter.flush();
			socket.shutdownOutput();

			InputStream iStream = socket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(iStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String datas = bufferedReader.readLine();
			while (datas != null) {
				System.out.println("------Client------");
				System.out.println(datas);
				datas = bufferedReader.readLine();
			}

			pWriter.close();
			or.close();
			oStream.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
