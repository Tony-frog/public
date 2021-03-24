package day17.jd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：下午3:27:47
* @description 描述：
*/
public class JD {


	@Test
	public void site() throws IOException, InterruptedException {
		//获取所有的三级分类
		List<String> catUrlList = JD.getCat3();
		//遍历3级分类
		for(String catUrl : catUrlList) {
			//延时
			Thread.sleep(10);
			
			//返回当前分类的总页数
			int maxNum = JD.getPageNum(catUrl);
			//某个分类下所有分页链接
			List<String> pageUrlList = JD.getPageUrlList(catUrl, maxNum);
			//遍历当前分类下的所有分页链接
			for(String pageUrl : pageUrlList) {
				//当前分页商品链接
				List<String> itemUrlList = JD.getItemUrlList(pageUrl);
				for(String itemUrl : itemUrlList) {
					System.out.println(itemUrl);
					//获取到当前商品链接，调用方法获取其标题、价格。。。
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
		System.out.println("处理标准三级分类："+catList.size());
	}
	
	//返回所有三级分类。京东三级分类：1286，标准有：1190
	public static List<String> getCat3() throws IOException{
		//所有分类都在里面
		String url = "http://www.jd.com/allSort.aspx";
		
		//通过选择器把三级分类过滤出来，集合
		Elements els = Jsoup.connect(url).get()
			.select("div dl dd a");
		
		//存放爬取所有三级分类链接
		List<String> catList = new ArrayList<String>();
		for(Element e : els) {
			//获取到三级分类a标签的链接值
			String catUrl = e.attr("href");
			
			//排除异常链接
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
	
	//获取某个分类下总页数，参数就是分类链接
	public static int getPageNum(String catUrl) throws IOException {
		Integer num = Integer.parseInt(
				Jsoup.connect(catUrl).get()
			.select(".fp-text i").get(0).text()
			);
		return num;
	}
	
	@Test	//测试某个分类下的所有的分页链接
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
	//拼接某个一个分类下的所有的分页链接
	public static List<String> getPageUrlList(String catUrl, Integer maxNum){
		List<String> pageUrlList = new ArrayList<String>();
		
		//遍历所有页数
		for(int i=1; i<=maxNum; i++) {
			String pageUrl = catUrl + "&page=" + i;
			pageUrlList.add(pageUrl);
		}
		return pageUrlList;
	}
	
@Test	//某个列表页面上所有商品链接地址
public void itemList() throws IOException {
	String pageUrl = "http://list.jd.com/list.html?cat=1713,3274&page=210";
	List<String> itemUrlList = JD.getItemUrlList(pageUrl);
	for(String itemUrl : itemUrlList) {
		System.out.println(itemUrl);
	}
}

//抓取某个列表页面中所有商品链接的地址，
public static List<String> getItemUrlList(String pageUrl) throws IOException{
	Elements els = Jsoup.connect(pageUrl).get()
		.select(".p-img a");

	List<String> itemUrlList = new ArrayList<String>();
	//所有a标签，过滤过的
	for(Element e : els) {
		//e是a标签，href属性值
		String itemUrl = e.attr("href");
		itemUrlList.add("http:"+itemUrl);
	}
	return itemUrlList;
}
}




