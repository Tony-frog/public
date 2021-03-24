package day18.xml;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：下午2:16:50
* @description 描述：解析XML, dom4j，最好用的工具类
*/
public class TestXML {
	//容器，mybatis容器
	private static final Map<String,String> mapperStatements = 
			new HashMap<String,String>();
	
	public static void main(String[] args) throws Exception {
		//1.创建SAX解析器，DOM（网页，早期）、SAX（新）
		SAXReader read = new SAXReader();
		String dir = TestXML.class.getResource("/").getPath();
		
		//通过read读取xml文件
		Document doc = read.read(new File(dir+"/day18/xml/OrderMapper.xml"));
		Element root = doc.getRootElement();	//xml根元素
	
		//System.out.println(root.getName());	//标签名
		//System.out.println(root.asXML());	//这个标签中的内容
		
		//命名空间，取根节点属性值
		String namespace = root.attributeValue("namespace");
		System.out.println("namespace="+namespace);
		
		//获取第一层元素
		for(Iterator<Element> it1 = root.elementIterator(); it1.hasNext(); ) {
			Element e = it1.next();	//获取下一个元素
			//System.out.println(e.asXML());
			
			//获取当前元素的属性
			for( Iterator<Attribute> it2 = e.attributeIterator();
					it2.hasNext(); ) {
				Attribute a = it2.next();		//获取下一个属性
				//System.out.println(a);
				
				//只处理id的名称
				if("id".equals(a.getName())){
					String key = namespace+"."+a.getValue();
					System.out.println(key);
					
					//获取元素中的内容，去掉空格
					String sql = e.getStringValue().trim();
					System.out.println(sql);
					
					mapperStatements.put(key, sql);
				}
			}
		}
		
		System.out.println("打印容器：");
		System.out.println(mapperStatements);
	}
}
