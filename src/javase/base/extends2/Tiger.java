package javase.base.extends2;

//类之间关系
public class Tiger extends Animal{
	public void eat() {
		System.out.println("老虎吃兔子");
	}
	
	@Override		//重写，覆盖父类方法
	public void run() {
		System.out.println("老虎跑的快");
	}

}
