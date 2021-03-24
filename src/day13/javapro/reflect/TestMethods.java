package day13.javapro.reflect;

import java.lang.reflect.Method;

import org.junit.Test;

public class TestMethods {
	@Test
	public void showMethod() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		//��ȡָ������
		Method m1 = clazz.getMethod("show");
		//obj��������m�ķ����ص���ִ�У�
		m1.invoke(obj);
		
		Method m2 = clazz.getMethod("show", String.class);
		m2.invoke(obj, "tom");
	}
	
	@Test//��ȡ���������еķ���
	public void all() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		//�������з�������ͨ����
		Method[] ms = clazz.getMethods();
		for(Method x : ms) {
			System.out.println(x);
		}
	}
}
