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
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����2:16:50
* @description ����������XML, dom4j������õĹ�����
*/
public class TestXML {
	//������mybatis����
	private static final Map<String,String> mapperStatements = 
			new HashMap<String,String>();
	
	public static void main(String[] args) throws Exception {
		//1.����SAX��������DOM����ҳ�����ڣ���SAX���£�
		SAXReader read = new SAXReader();
		String dir = TestXML.class.getResource("/").getPath();
		
		//ͨ��read��ȡxml�ļ�
		Document doc = read.read(new File(dir+"/day18/xml/OrderMapper.xml"));
		Element root = doc.getRootElement();	//xml��Ԫ��
	
		//System.out.println(root.getName());	//��ǩ��
		//System.out.println(root.asXML());	//�����ǩ�е�����
		
		//�����ռ䣬ȡ���ڵ�����ֵ
		String namespace = root.attributeValue("namespace");
		System.out.println("namespace="+namespace);
		
		//��ȡ��һ��Ԫ��
		for(Iterator<Element> it1 = root.elementIterator(); it1.hasNext(); ) {
			Element e = it1.next();	//��ȡ��һ��Ԫ��
			//System.out.println(e.asXML());
			
			//��ȡ��ǰԪ�ص�����
			for( Iterator<Attribute> it2 = e.attributeIterator();
					it2.hasNext(); ) {
				Attribute a = it2.next();		//��ȡ��һ������
				//System.out.println(a);
				
				//ֻ����id������
				if("id".equals(a.getName())){
					String key = namespace+"."+a.getValue();
					System.out.println(key);
					
					//��ȡԪ���е����ݣ�ȥ���ո�
					String sql = e.getStringValue().trim();
					System.out.println(sql);
					
					mapperStatements.put(key, sql);
				}
			}
		}
		
		System.out.println("��ӡ������");
		System.out.println(mapperStatements);
	}
}
