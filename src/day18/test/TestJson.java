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
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：上午10:27:15
* @description 描述：
*/
public class TestJson {
	//引入jackson
	private static final ObjectMapper MAPPER 
		= new ObjectMapper();
	
	@Test	//序列化：把java对象转成json字符串
	public void toJson() throws Exception {
		//1. 准备java对象
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("java培优学员");
		p1.setAge(18);
		
		//2. 把java对象转成json字符串
		//writeValueAsString，把对象转成字符串：序列化
		String json = MAPPER.writeValueAsString(p1);
		System.out.println(json);
		
		//3. 集合序列化
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("java高手班学员");
		p2.setAge(20);
		
		personList.add(p2);
		
		String jsonList = MAPPER.writeValueAsString(personList);
		System.out.println(jsonList);
	}
	
	@Test	//反序列化：把json转成java对象
	public void toJava() throws Exception {
		String json = "{\"id\":1,\"name\":\"java培优学员\",\"age\":18}";
		//变成java对象
		//把这个json字符串转换放到哪个对象中Person.class
		Person p = MAPPER.readValue(json, Person.class);
		//底层其实反射，(id)f.set(obj,1)
		System.out.println(p);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p);
		
		//多加几个person
		for(int i=0;i<5; i++) {
			Person ps = new Person();
			ps.setId(i);
			ps.setName("tony"+i);
			ps.setAge(18+i);
			
			personList.add(ps);
		}
		
		String jsonList = MAPPER.writeValueAsString(personList);
		//把Json多条记录转List集合中
		//先要把集合json字符串转成JsonNode对象
		JsonNode node = MAPPER.readTree(jsonList);
		//第一个参数JsonParser类型
		List<Person> pList = MAPPER.readValue(node.traverse(), 
				MAPPER.getTypeFactory()
				.constructCollectionType(List.class, Person.class)
		);
		System.out.println(pList);
	}
	
}
