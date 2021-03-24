package day13.javapro.reflect;
/**
* @author 作者：tony chan
* @version 创建时间：下午5:39:45
* @description 描述：
*/
public class HelloPrivate {
	private String name = "私有的你看不见，哈";
	
	private void show() {
		System.out.println("我是私有的不让你访问");
	}
}
