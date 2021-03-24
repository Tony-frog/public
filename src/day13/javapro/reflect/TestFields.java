package day13.javapro.reflect;

import java.lang.reflect.Field;

import org.junit.Test;

public class TestFields {
	@Test
	public void publicField() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		Field f = clazz.getField("name");
		System.out.println(f.get(obj));
	}
	
	@Test //��ȡ˽�����ԣ����÷���Ȩ��
	public void privateField() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		//��ȡ����
		Field f = clazz.getDeclaredField("id");
		//˽������Ҫ����Ȩ��
		f.setAccessible(true);
		System.out.println(f);
		
		//��ȡֵ���Ӷ���ʵ����ȡֵ
		Integer id = (Integer)f.get(obj);
		System.out.println(id);
		
		//û��set����Ҫ����˽�����Ե�ֵ
		//��һ����field������������
		f.set(obj, 20);		//id=set(20)
		id = (Integer)f.get(obj);
		System.out.println(id);
	}
}
