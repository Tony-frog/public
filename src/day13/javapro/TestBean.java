package day13.javapro;

import day13.javapro.junit4.Test;

/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺2019��8��16�� ����11:22:23
* @description ������
*/
public class TestBean {
	@Test    //�µĴ�����ʽ��
	public void newCreateObject() throws Exception {
		//���÷����������spring�ײ�
		String classname = "day13.javapro.Person";
		Class<?> clazz = Class.forName(classname);
		
		Object obj = clazz.newInstance();		//����ʵ��
		Person p = (Person)obj;	//����ǿ��ת�����������෽��
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p);
	}
	
	@Test	//��ͳ����������
	public void oldCreateObject() {
		Person p1 = new Person();
		System.out.println(p1);
	}
	
	
}
