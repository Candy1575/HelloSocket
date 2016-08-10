package com.candy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


//使用URl来读取网页内容
public class UrlIO {
	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.baidu.com");
			InputStream iStream=url.openStream();
			InputStreamReader inputStreamReader=new InputStreamReader(iStream,"utf-8");
			BufferedReader brBufferedReader=new BufferedReader(inputStreamReader);
			String data=brBufferedReader.readLine();
			while(data!=null){
				System.out.println(data);
				data=brBufferedReader.readLine();
			}
			brBufferedReader.close();
			inputStreamReader.close();
			iStream.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
