package com.aograph.crawler;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class CrawlerAction {

	private static final String URL = "http://www.tom61.com/";
	
	public static void main(String[] args) throws Exception {
		Connection conn = Jsoup.connect(URL)
								.userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0")
								.timeout(5000)
								.method(Connection.Method.GET);
		Document doc = conn.get();
		Element body = doc.body();
		
		
	}
}
