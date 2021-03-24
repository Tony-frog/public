package day13.javapro.junit3;

import java.lang.reflect.Method;

public class TestJUnit3 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.junit3.Hello");
		Object obj = clazz.newInstance();
		
		//调用所有方法
		//Method[] ms = clazz.getMethods();	//把父类
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m : ms) {
			//执行每个方法
			//System.out.println("方法名："+m.getName());
			String methodName = m.getName();
			if(methodName.startsWith("test")) {
				m.invoke(obj);	//回调每个方法
			}
		}
	}
}
