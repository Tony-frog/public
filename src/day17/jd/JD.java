package day17.jd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����3:27:47
* @description ������
*/
public class JD {


	@Test
	public void site() throws IOException, InterruptedException {
		//��ȡ���е���������
		List<String> catUrlList = JD.getCat3();
		//����3������
		for(String catUrl : catUrlList) {
			//��ʱ
			Thread.sleep(10);
			
			//���ص�ǰ�������ҳ��
			int maxNum = JD.getPageNum(catUrl);
			//ĳ�����������з�ҳ����
			List<String> pageUrlList = JD.getPageUrlList(catUrl, maxNum);
			//������ǰ�����µ����з�ҳ����
			for(String pageUrl : pageUrlList) {
				//��ǰ��ҳ��Ʒ����
				List<String> itemUrlList = JD.getItemUrlList(pageUrl);
				for(String itemUrl : itemUrlList) {
					System.out.println(itemUrl);
					//��ȡ����ǰ��Ʒ���ӣ����÷�����ȡ����⡢�۸񡣡���
				}
			}
		}
	}
	
	@Test
	public void testCat3() throws IOException {
		List<String> catList = JD.getCat3();
		for(String url : catList) {
			System.out.println(url);
		}
		System.out.println("�����׼�������ࣺ"+catList.size());
	}
	
	//���������������ࡣ�����������ࣺ1286����׼�У�1190
	public static List<String> getCat3() throws IOException{
		//���з��඼������
		String url = "http://www.jd.com/allSort.aspx";
		
		//ͨ��ѡ����������������˳���������
		Elements els = Jsoup.connect(url).get()
			.select("div dl dd a");
		
		//�����ȡ����������������
		List<String> catList = new ArrayList<String>();
		for(Element e : els) {
			//��ȡ����������a��ǩ������ֵ
			String catUrl = e.attr("href");
			
			//�ų��쳣����
			if(catUrl.startsWith("//list.jd.com/list.html?cat=")) {
				catList.add("http:"+catUrl);
			}
		}
		
		return catList;
	}
	
	@Test
	public void pageNum() throws IOException {
		String catUrl = "http://list.jd.com/list.html?cat=1713,3274&jth=i";
		int num = JD.getPageNum(catUrl);
		System.out.println(num);
	}
	
	//��ȡĳ����������ҳ�����������Ƿ�������
	public static int getPageNum(String catUrl) throws IOException {
		Integer num = Integer.parseInt(
				Jsoup.connect(catUrl).get()
			.select(".fp-text i").get(0).text()
			);
		return num;
	}
	
	@Test	//����ĳ�������µ����еķ�ҳ����
	public void pageList() throws IOException {
		String catUrl = "https://list.jd.com/list.html?cat=1713,3274";
		Integer maxNum = JD.getPageNum(catUrl);
		List<String> itemList = JD.getPageUrlList(catUrl, maxNum);
		for(String item : itemList) {
			System.out.println(item);
		}
	}
	
	//https://list.jd.com/list.html?cat=1713,3274&page=1
	//https://list.jd.com/list.html?cat=1713,3274&page=2
	//ƴ��ĳ��һ�������µ����еķ�ҳ����
	public static List<String> getPageUrlList(String catUrl, Integer maxNum){
		List<String> pageUrlList = new ArrayList<String>();
		
		//��������ҳ��
		for(int i=1; i<=maxNum; i++) {
			String pageUrl = catUrl + "&page=" + i;
			pageUrlList.add(pageUrl);
		}
		return pageUrlList;
	}
	
@Test	//ĳ���б�ҳ����������Ʒ���ӵ�ַ
public void itemList() throws IOException {
	String pageUrl = "http://list.jd.com/list.html?cat=1713,3274&page=210";
	List<String> itemUrlList = JD.getItemUrlList(pageUrl);
	for(String itemUrl : itemUrlList) {
		System.out.println(itemUrl);
	}
}

//ץȡĳ���б�ҳ����������Ʒ���ӵĵ�ַ��
public static List<String> getItemUrlList(String pageUrl) throws IOException{
	Elements els = Jsoup.connect(pageUrl).get()
		.select(".p-img a");

	List<String> itemUrlList = new ArrayList<String>();
	//����a��ǩ�����˹���
	for(Element e : els) {
		//e��a��ǩ��href����ֵ
		String itemUrl = e.attr("href");
		itemUrlList.add("http:"+itemUrl);
	}
	return itemUrlList;
}
}




