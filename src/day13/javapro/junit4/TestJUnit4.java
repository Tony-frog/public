package day13.javapro.junit4;

import java.lang.reflect.Method;

/**
* @author 作者：tony chan
* @version 创建时间：2019年8月16日 下午5:07:01
* @description 描述：
*/
public class TestJUnit4 {
	
	//执行所有@Test注解的方法，没有的就不执行
	public static void main(String[] args) throws Exception{
		Class<?> clazz = Class.forName("day13.javapro.junit4.Hello");
		Object obj = clazz.newInstance();
		
		//获取类上面的所有注解 @Test
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m :ms) {
			//判断方法上有@Test注解才可以执行
			Test t = m.getDeclaredAnnotation(Test.class);
			if (t != null) {	//只处理@Test方法
				//System.out.println(m);
				
				m.invoke(obj);
			}
		}
	}
	
	
}
