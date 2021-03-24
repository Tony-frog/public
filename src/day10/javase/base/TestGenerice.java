package day10.javase.base;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;	//反射
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author tony
 *
 */
public class TestGenerice {
	public static void main(String[] args) throws Exception {
		List<String> aList = new ArrayList<String>();
		aList.add("abc");
		//aList.add(100);		编译期报错，泛型检查		
		
		//证明它是个语法糖，实际class中不存在检查
		//必须在运行期对它进行动态执行 add（"abc"）方法
		
		/*
		 * 开发步骤：
		 * 1、运行期获取代码结构，只能利用反射技术
		 * 2、反射前先必须获取当前对象所属类
		 * 3、获取List上面方法 add
		 * 4、获取方法add后进行调用，这个动作称为：回调 invoke
		 * 5、把100赋值
		 * 6、遍历这个List，如果能打印出100
		 * 证明泛型在运行时不存在，也就不会类型检查
		 */
		
		Class<?> clazz = aList.getClass();	//根据当前对象获取到类
		//获取方法对象，及含有String又含有Integer，只能Object父类
		Method m = clazz.getDeclaredMethod("add", Object.class);
		//开放权限
		m.setAccessible(true);
		
		//调用这个方法：回调
		//第一个参数：add从属哪个对象，第二参数：add方法参数值
		m.invoke(aList, 100);		// aList.add(100);
		
		//遍历
		for(Object o : aList) {
			System.out.println(o);
		}
	}
}
