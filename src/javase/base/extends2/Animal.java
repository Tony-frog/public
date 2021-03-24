package javase.base.extends2;

//抽象类，小组长：干一半，不干一半
public abstract class Animal {
	public void eat() {
		System.out.println("我要吃饭");
	}
	
	//规定一个方法但不去实现
//	public void run() {
//		System.out.println("我会跑");
//	}
	//abstract抽象方法，没有方法体，谁继承它就必须实现这个方法、
	//如果一个类中有抽象方法，那这个类也必须抽象类
	abstract public void run();
	
}
