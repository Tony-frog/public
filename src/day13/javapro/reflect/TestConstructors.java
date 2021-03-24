package day13.javapro.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class TestConstructors {
	@Test
	public void defaultConstructor() throws Exception {
		Class<?> clazz = 
				Class.forName("day13.javapro.reflect.Hello");
		//������
		clazz.newInstance();	
		
		//�����л�ȡ���췽����������DeclaredConstructor
		Constructor<?> c = clazz.getDeclaredConstructor();
		
		//ֱ�ӵ��ã�����ʵ��
		//���췽��
		c.newInstance();		//���ù��췽������������ʵ��
	}
	
	@Test
	public void normalConstructor() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		
		//�вι��죬д�����༴��
		Constructor<?> c = clazz.getDeclaredConstructor(String.class);
		c.newInstance("tony");		//���ݲ���ֵ
	}
	
	@Test	//һ��֪��������Щ���췽��
	public void all() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		//��ȡ�����еĹ��췽��
		Constructor[] cs = clazz.getDeclaredConstructors();
		for(Constructor c : cs) {
			System.out.println(c);
		}
	}
}
