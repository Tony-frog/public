package javase.base.extendsc;

//把子类和父类关联，继承动物类
public class Tiger  extends Animal{
	public Tiger() {
		System.out.println("Tiger 的默认构造");
	}
	
	public void run() {
		System.out.println("我是老虎，我是陆地之王！");
	}
}
