package com.aograph.crawler;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlerAction {

	private static final String URL = "http://www.tom61.com/ertongwenxue/shuiqiangushi/";
	private static final String BASE_URL = "http://www.tom61.com/";
	
	public static void main(String[] args) throws Exception {
		Connection conn = Jsoup.connect(URL)
								.userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0")
								.timeout(5000)
								.method(Connection.Method.GET);
		Document doc = conn.get();
		Element body = doc.body();
		
		Element element = body.getElementById("Mhead2_0");
		Elements elementsByTag = element.getElementsByTag("dd");
		for(Element dd : elementsByTag) {
			StringBuffer bs = new StringBuffer("");
			Element aa = dd.select("a").get(0);
			String addr = aa.attr("href");
			Connection con = Jsoup.connect(BASE_URL + addr)
					.userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0")
					.timeout(5000)
					.method(Connection.Method.GET);
			Document document = con.get();
			Element context = document.body();
			
			Elements storys = context.getElementsByClass("t_news");
			Element story = storys.get(0);
			String title = story.getElementsByTag("h1").get(0).text();
			
			Element newsText = story.getElementsByClass("t_news_txt").get(0);
			Elements ps = newsText.getElementsByTag("p");
			for (Element p : ps) {
				bs.append(p.text());
			}
			String article = bs.toString();
			
			System.out.println(title+ "---" + article);
		}
	}
}
