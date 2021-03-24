package day13.javapro;
/**
* @author 作者：tony chan
* @version 创建时间：2019年8月16日 上午10:36:23
* @description 描述：
*/
public class TestController {
	//利用反射，
	/*
	 * 如果这个类上标识@Controller注解才进行处理
	 * 获取@Controller它的value属性，打印
	 */
	public static void main(String[] args) throws Exception {
		//全局限定名：包路径.类名
		String className = "day13.javapro.HelloController";
		Class<?> clazz = Class.forName(className);
		
		//利用反射的方法从类中获取注解
		Controller ca = clazz.getAnnotation(Controller.class);
		//直接判断
		if(ca != null) {
			System.out.println(ca.value());
		}
		System.out.println("执行完成");
	}
}
