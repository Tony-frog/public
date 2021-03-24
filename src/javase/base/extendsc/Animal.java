package javase.base.extendsc;

//动物，父类
public class Animal {
	static String name;
	
	//默认构造
	public Animal() {
		System.out.println("Animal类默认构造");
	}
	
	//公用
	public void eat() {
		System.out.println("我要吃饭");
	}
}
