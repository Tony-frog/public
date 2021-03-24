package day13.javapro.junit4;

import java.lang.reflect.Method;

/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺2019��8��16�� ����5:07:01
* @description ������
*/
public class TestJUnit4 {
	
	//ִ������@Testע��ķ�����û�еľͲ�ִ��
	public static void main(String[] args) throws Exception{
		Class<?> clazz = Class.forName("day13.javapro.junit4.Hello");
		Object obj = clazz.newInstance();
		
		//��ȡ�����������ע�� @Test
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m :ms) {
			//�жϷ�������@Testע��ſ���ִ��
			Test t = m.getDeclaredAnnotation(Test.class);
			if (t != null) {	//ֻ����@Test����
				//System.out.println(m);
				
				m.invoke(obj);
			}
		}
	}
	
	
}
