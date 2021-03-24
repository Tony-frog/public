package day13.javapro;

import day13.javapro.junit4.Test;

/**
* @author 作者：tony chan
* @version 创建时间：2019年8月16日 上午11:22:23
* @description 描述：
*/
public class TestBean {
	@Test    //新的创建方式：
	public void newCreateObject() throws Exception {
		//利用反射产生对象，spring底层
		String classname = "day13.javapro.Person";
		Class<?> clazz = Class.forName(classname);
		
		Object obj = clazz.newInstance();		//创建实例
		Person p = (Person)obj;	//必须强制转换，调用子类方法
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p);
	}
	
	@Test	//传统创建方法：
	public void oldCreateObject() {
		Person p1 = new Person();
		System.out.println(p1);
	}
	
	
}
