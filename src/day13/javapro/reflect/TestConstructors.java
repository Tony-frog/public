package day13.javapro.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class TestConstructors {
	@Test
	public void defaultConstructor() throws Exception {
		Class<?> clazz = 
				Class.forName("day13.javapro.reflect.Hello");
		//主体类
		clazz.newInstance();	
		
		//从类中获取构造方法，尽量用DeclaredConstructor
		Constructor<?> c = clazz.getDeclaredConstructor();
		
		//直接调用，对象实例
		//构造方法
		c.newInstance();		//利用构造方法来创建对象实例
	}
	
	@Test
	public void normalConstructor() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		
		//有参构造，写参数类即可
		Constructor<?> c = clazz.getDeclaredConstructor(String.class);
		c.newInstance("tony");		//传递参数值
	}
	
	@Test	//一下知道类有哪些构造方法
	public void all() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		//获取到所有的构造方法
		Constructor[] cs = clazz.getDeclaredConstructors();
		for(Constructor c : cs) {
			System.out.println(c);
		}
	}
}
