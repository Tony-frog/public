package day18.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import day18.pojo.Person;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����10:27:15
* @description ������
*/
public class TestJson {
	//����jackson
	private static final ObjectMapper MAPPER 
		= new ObjectMapper();
	
	@Test	//���л�����java����ת��json�ַ���
	public void toJson() throws Exception {
		//1. ׼��java����
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("java����ѧԱ");
		p1.setAge(18);
		
		//2. ��java����ת��json�ַ���
		//writeValueAsString���Ѷ���ת���ַ��������л�
		String json = MAPPER.writeValueAsString(p1);
		System.out.println(json);
		
		//3. �������л�
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("java���ְ�ѧԱ");
		p2.setAge(20);
		
		personList.add(p2);
		
		String jsonList = MAPPER.writeValueAsString(personList);
		System.out.println(jsonList);
	}
	
	@Test	//�����л�����jsonת��java����
	public void toJava() throws Exception {
		String json = "{\"id\":1,\"name\":\"java����ѧԱ\",\"age\":18}";
		//���java����
		//�����json�ַ���ת���ŵ��ĸ�������Person.class
		Person p = MAPPER.readValue(json, Person.class);
		//�ײ���ʵ���䣬(id)f.set(obj,1)
		System.out.println(p);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p);
		
		//��Ӽ���person
		for(int i=0;i<5; i++) {
			Person ps = new Person();
			ps.setId(i);
			ps.setName("tony"+i);
			ps.setAge(18+i);
			
			personList.add(ps);
		}
		
		String jsonList = MAPPER.writeValueAsString(personList);
		//��Json������¼תList������
		//��Ҫ�Ѽ���json�ַ���ת��JsonNode����
		JsonNode node = MAPPER.readTree(jsonList);
		//��һ������JsonParser����
		List<Person> pList = MAPPER.readValue(node.traverse(), 
				MAPPER.getTypeFactory()
				.constructCollectionType(List.class, Person.class)
		);
		System.out.println(pList);
	}
	
}
