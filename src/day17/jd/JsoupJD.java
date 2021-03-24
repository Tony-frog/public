package day17.jd;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：上午10:09:12
* @description 描述：
*/
public class JsoupJD {
	//全局唯一
	private static final ObjectMapper MAPPER = 
			new ObjectMapper();
	
	@Test	//抓取京东商品的标题
	public void title() throws IOException {
		String url = "http://item.jd.com/7652061.html";
		//创建链接
		Connection cn = Jsoup.connect(url);
		//获取页面
		Document doc = cn.get();
		//利用选择器，组合div标签+class样式名称，中间用空格
		Elements els = doc.select("div .sku-name");
		//从集合中获取元素
		Element ele = els.get(0);	//一般正确的话，集合只有一个元素
		//获取标签中的内容
		String title = ele.text();
		System.out.println(title);
	}
	
	@Test	//抓取商品的图片，多张图片
	public void pics() throws IOException {
		String url = "http://item.jd.com/7652061.html";
		//找关系时必须嵌套关系，不能平行关系，找出是静态的
		//id前面#，有先后顺序
		Elements els = Jsoup.connect(url).get()
				.select("#spec-list ul li img");
		
		System.out.println(els);
	}
	
	@Test	//抓取商品价格
	public void price() throws IOException {
		//二次请求，去找所有请求，猜链接price
		String url = "https://p.3.cn/prices/mgets?skuIds=J_7652061";
		//结果是json字符串：
		//页面返回html，
		//返回网页类型：ContextType：text/html；
		//默认早期不管，当成html；新的规范强制要告诉返回是什么类型
		
		//反爬虫，它不让你抓。设置一个请求头，欺骗服务器
		//骗它，告诉服务器我是一个浏览器userAgent用户代理，具体浏览器固定名称
		String json = Jsoup.connect(url)
			.userAgent("Mozilla/5.0 (Windows NT 5.1; zh-CN) AppleWebKit/535.12 (KHTML, like Gecko) Chrome/22.0.1229.79 Safari/535.12")
			.ignoreContentType(true).execute().body();
		
		System.out.println(json);
		
		//利用jackson解析出p的key
		//1. 创建工具类对象
		//ObjectMapper MAPPER = new ObjectMapper();
		
		//2. 转成jackson它的自己的对象
		//[{"cbf":"0","id":"J_7652061","m":"10000.00","op":"1999.00","p":"1999.00"}]
		JsonNode node = MAPPER.readTree(json);
		//3. 获取第一条数据，实际就一条数据
		//{"cbf":"0","id":"J_7652061","m":"10000.00","op":"1999.00","p":"1999.00"}
		JsonNode nodeSub = node.get(0);
		//获取p元素
		JsonNode priceNode = nodeSub.get("p");
		Double price = priceNode.asDouble();	//把字符串，强制转换成double
		System.out.println(price);
	}
	
	@Test	//解析商品备注
	public void desc() throws IOException {
		String url = "http://cd.jd.com/description/channel?skuId=7652061&mainSkuId=7652061&cdn=2&callback=showdesc";
		String jsonp = Jsoup.connect(url)
			.ignoreContentType(true).execute().body();
		
		//showdesc({“date”: 1566455812184,” content”,”1232123123”})
		int pos = jsonp.indexOf("(")+1;
		String json = jsonp.substring(pos, jsonp.length()-1);
		//System.out.println(json);
		
		
		//把内容解析出来
		JsonNode  node = MAPPER.readTree(json);
		String desc = node.get("content").asText();
		System.out.println(desc);
	}
	
}




