package day13.javapro.junit3;

import java.lang.reflect.Method;

public class TestJUnit3 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.junit3.Hello");
		Object obj = clazz.newInstance();
		
		//�������з���
		//Method[] ms = clazz.getMethods();	//�Ѹ���
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m : ms) {
			//ִ��ÿ������
			//System.out.println("��������"+m.getName());
			String methodName = m.getName();
			if(methodName.startsWith("test")) {
				m.invoke(obj);	//�ص�ÿ������
			}
		}
	}
}
