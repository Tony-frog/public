package javase.base.implementsc;

//调用接口
public class TestInterface {
	public static void main(String[] args) {
		//接口和抽象类一样不允许new，new出来方法也执行不了，没意义
		//接口，实例名称 = new 创建实现类，an代表实现类
		Animal an = new AnimalImpl();
		an.eat();
		an.run();
	}
}
