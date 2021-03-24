package day16.jsoup;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：下午3:42:55
* @description 描述：Jsoup测试各种方法
*/
public class TestJsoup {
	@Test	//获取一个网站首页
	public void page() throws IOException {
		String url = "http://finance.people.com.cn/n1/2019/0820/c1004-31306717.html";
		/*
		 * connect 链接
		 * execute 执行
		 * body 获取的结果的内容
		 */
		String page = Jsoup.connect(url).execute().body();
		System.out.println(page);
	}
	
	@Test	//获取一个网站 ( 遍历a标签，遍历方式：深度遍历、广度遍历)
	public void site() throws IOException {
		//jsoup威力，它可以解析html页面，挑出我们需要的内容
		String url = "http://finance.people.com.cn/n1/2019/0820/c1004-31306717.html";
		//创建一个链接
		Connection cn = Jsoup.connect(url);
		//就是一个页面对象
		Document doc = cn.get();
		//要所有<a>标签tag，称为超链接
		Elements els = doc.getElementsByTag("a");	//获取这个页面上的所有a标签
		//遍历集合
		for(Element ele : els) {
			//要元素的属性：href
			String href = ele.attr("href");
			System.out.println(href);
		}
	}
	
	@Test	//抓取新闻标题
	public void title() throws IOException {
		String url = "http://news.sina.com.cn/o/2019-08-20/doc-ihytcern2239237.shtml";
		//<h1 class="main-title">丘吉尔故居装18K金马桶 每人只能用3分钟还要预约</h1>
		//支持三种：标签a,h1；id=#n；样式css：.class
		String title = Jsoup.connect(url).get()		//返回页面对象Document
				.select(".main-title")		//选择器，根据样式进行过滤，只留下我们关心的内容，返回是一个集合
				.get(0)	//我们知道它选择正确后，只有一个元素，get(0)获取到第一个元素
				.text();	//text()方法就获取这个h1标签的内容
		//方法一直连着写，称作链式编程。
		
		System.out.println(title);
	}
	
	@Test	//获取新闻图片
	public void pic() throws IOException {
		/*
		 * 图片获取步骤：
		 * 1）找父标签，它的特征
		 * 2）在找img标签，最终获取src属性
		 */
		String url = "http://news.sina.com.cn/o/2019-08-20/doc-ihytcern2239237.shtml";
		//在没有特征点，只能返回一个图片集合
		Elements els = Jsoup.connect(url).get()
				.select(".img_wrapper");	//div特征
		
		String picUrl = "http:"+els.get(0).getElementsByTag("img").get(0)
				.attr("src");	//获取img标签它的src属性
		System.out.println(picUrl);
	}
	

}




