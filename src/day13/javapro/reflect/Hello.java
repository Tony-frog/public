package day13.javapro.reflect;
public class Hello {
	private Integer id = 10;
	public String name = "tony";
	
	//通过反射来调用
	public Hello() {	
		System.out.println("默认构造");
	}
	
	public Hello(String name) {
		System.out.println("有参构造：" + name);
	}
	
	//普通方法，回调
	public void show() {
		System.out.println("show() : "+name);
	}
	
	public void show(String name) {
		System.out.println("show() ：" + name);
	}
}
