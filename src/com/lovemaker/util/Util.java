package com.lovemaker.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Util {

	public static String getString(String urlString) throws IOException {
		// Create URL
		URL url = new URL(urlString);

		// Open connection
		URLConnection conn = url.openConnection();

		InputStream is = conn.getInputStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(is, "GBK"));

		StringBuffer stringBuffer = new StringBuffer();

		String text = null;

		while ((text = br.readLine()) != null) {
			stringBuffer.append(text);
		}

		return stringBuffer.toString();
	}


	public static void main(String[] args) {
		try {
			System.out.println(Util.getString("https://www.baidu.com"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
