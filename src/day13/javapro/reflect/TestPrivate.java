package day13.javapro.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺����5:41:35
* @description ������
*/
public class TestPrivate {
	@Test
	public void privateField() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.HelloPrivate");
		Object obj = clazz.newInstance();
		
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		
		String name = (String)f.get(obj);
		System.out.println(name);
		
		f.set(obj, "�ı��˰ɣ�С��");
		System.out.println(f.get(obj));
		
	}
	
	@Test
	public void privateMethod() throws Exception{
		Class<?> clazz = Class.forName("day13.javapro.reflect.HelloPrivate");
		Object obj = clazz.newInstance();
		
		Method m = clazz.getDeclaredMethod("show");
		m.setAccessible(true);
		m.invoke(obj);
	}
}
