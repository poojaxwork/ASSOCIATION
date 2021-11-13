
package com.xwork.starter;

import com.xwork.diode.NewsPaper;

public class NewsRunner {

	public static void main(String[] args) {
		NewsPaper news = new NewsPaper();
		System.out.println(news.toString());
		System.out.println(news.hashCode());
		NewsPaper news1 = new NewsPaper();
		news.setLang("Kannada");
		news1.setLang("Kannad");
		news.setName("VijayVani");
		news1.setName("VijayVani");
		System.out.println(news.equals(news1));

	}

}
