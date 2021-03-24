package day16.jsoup;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����3:42:55
* @description ������Jsoup���Ը��ַ���
*/
public class TestJsoup {
	@Test	//��ȡһ����վ��ҳ
	public void page() throws IOException {
		String url = "http://finance.people.com.cn/n1/2019/0820/c1004-31306717.html";
		/*
		 * connect ����
		 * execute ִ��
		 * body ��ȡ�Ľ��������
		 */
		String page = Jsoup.connect(url).execute().body();
		System.out.println(page);
	}
	
	@Test	//��ȡһ����վ ( ����a��ǩ��������ʽ����ȱ�������ȱ���)
	public void site() throws IOException {
		//jsoup�����������Խ���htmlҳ�棬����������Ҫ������
		String url = "http://finance.people.com.cn/n1/2019/0820/c1004-31306717.html";
		//����һ������
		Connection cn = Jsoup.connect(url);
		//����һ��ҳ�����
		Document doc = cn.get();
		//Ҫ����<a>��ǩtag����Ϊ������
		Elements els = doc.getElementsByTag("a");	//��ȡ���ҳ���ϵ�����a��ǩ
		//��������
		for(Element ele : els) {
			//ҪԪ�ص����ԣ�href
			String href = ele.attr("href");
			System.out.println(href);
		}
	}
	
	@Test	//ץȡ���ű���
	public void title() throws IOException {
		String url = "http://news.sina.com.cn/o/2019-08-20/doc-ihytcern2239237.shtml";
		//<h1 class="main-title">�𼪶��ʾ�װ18K����Ͱ ÿ��ֻ����3���ӻ�ҪԤԼ</h1>
		//֧�����֣���ǩa,h1��id=#n����ʽcss��.class
		String title = Jsoup.connect(url).get()		//����ҳ�����Document
				.select(".main-title")		//ѡ������������ʽ���й��ˣ�ֻ�������ǹ��ĵ����ݣ�������һ������
				.get(0)	//����֪����ѡ����ȷ��ֻ��һ��Ԫ�أ�get(0)��ȡ����һ��Ԫ��
				.text();	//text()�����ͻ�ȡ���h1��ǩ������
		//����һֱ����д��������ʽ��̡�
		
		System.out.println(title);
	}
	
	@Test	//��ȡ����ͼƬ
	public void pic() throws IOException {
		/*
		 * ͼƬ��ȡ���裺
		 * 1���Ҹ���ǩ����������
		 * 2������img��ǩ�����ջ�ȡsrc����
		 */
		String url = "http://news.sina.com.cn/o/2019-08-20/doc-ihytcern2239237.shtml";
		//��û�������㣬ֻ�ܷ���һ��ͼƬ����
		Elements els = Jsoup.connect(url).get()
				.select(".img_wrapper");	//div����
		
		String picUrl = "http:"+els.get(0).getElementsByTag("img").get(0)
				.attr("src");	//��ȡimg��ǩ����src����
		System.out.println(picUrl);
	}
	

}




