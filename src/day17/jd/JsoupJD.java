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
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����10:09:12
* @description ������
*/
public class JsoupJD {
	//ȫ��Ψһ
	private static final ObjectMapper MAPPER = 
			new ObjectMapper();
	
	@Test	//ץȡ������Ʒ�ı���
	public void title() throws IOException {
		String url = "http://item.jd.com/7652061.html";
		//��������
		Connection cn = Jsoup.connect(url);
		//��ȡҳ��
		Document doc = cn.get();
		//����ѡ���������div��ǩ+class��ʽ���ƣ��м��ÿո�
		Elements els = doc.select("div .sku-name");
		//�Ӽ����л�ȡԪ��
		Element ele = els.get(0);	//һ����ȷ�Ļ�������ֻ��һ��Ԫ��
		//��ȡ��ǩ�е�����
		String title = ele.text();
		System.out.println(title);
	}
	
	@Test	//ץȡ��Ʒ��ͼƬ������ͼƬ
	public void pics() throws IOException {
		String url = "http://item.jd.com/7652061.html";
		//�ҹ�ϵʱ����Ƕ�׹�ϵ������ƽ�й�ϵ���ҳ��Ǿ�̬��
		//idǰ��#�����Ⱥ�˳��
		Elements els = Jsoup.connect(url).get()
				.select("#spec-list ul li img");
		
		System.out.println(els);
	}
	
	@Test	//ץȡ��Ʒ�۸�
	public void price() throws IOException {
		//��������ȥ���������󣬲�����price
		String url = "https://p.3.cn/prices/mgets?skuIds=J_7652061";
		//�����json�ַ�����
		//ҳ�淵��html��
		//������ҳ���ͣ�ContextType��text/html��
		//Ĭ�����ڲ��ܣ�����html���µĹ淶ǿ��Ҫ���߷�����ʲô����
		
		//�����棬��������ץ������һ������ͷ����ƭ������
		//ƭ�������߷���������һ�������userAgent�û���������������̶�����
		String json = Jsoup.connect(url)
			.userAgent("Mozilla/5.0 (Windows NT 5.1; zh-CN) AppleWebKit/535.12 (KHTML, like Gecko) Chrome/22.0.1229.79 Safari/535.12")
			.ignoreContentType(true).execute().body();
		
		System.out.println(json);
		
		//����jackson������p��key
		//1. �������������
		//ObjectMapper MAPPER = new ObjectMapper();
		
		//2. ת��jackson�����Լ��Ķ���
		//[{"cbf":"0","id":"J_7652061","m":"10000.00","op":"1999.00","p":"1999.00"}]
		JsonNode node = MAPPER.readTree(json);
		//3. ��ȡ��һ�����ݣ�ʵ�ʾ�һ������
		//{"cbf":"0","id":"J_7652061","m":"10000.00","op":"1999.00","p":"1999.00"}
		JsonNode nodeSub = node.get(0);
		//��ȡpԪ��
		JsonNode priceNode = nodeSub.get("p");
		Double price = priceNode.asDouble();	//���ַ�����ǿ��ת����double
		System.out.println(price);
	}
	
	@Test	//������Ʒ��ע
	public void desc() throws IOException {
		String url = "http://cd.jd.com/description/channel?skuId=7652061&mainSkuId=7652061&cdn=2&callback=showdesc";
		String jsonp = Jsoup.connect(url)
			.ignoreContentType(true).execute().body();
		
		//showdesc({��date��: 1566455812184,�� content��,��1232123123��})
		int pos = jsonp.indexOf("(")+1;
		String json = jsonp.substring(pos, jsonp.length()-1);
		//System.out.println(json);
		
		
		//�����ݽ�������
		JsonNode  node = MAPPER.readTree(json);
		String desc = node.get("content").asText();
		System.out.println(desc);
	}
	
}




