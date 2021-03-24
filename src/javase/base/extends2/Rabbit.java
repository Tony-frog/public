package javase.base.extends2;

public class Rabbit extends Animal{

	@Override	//重写，重写父类抽象方法，没有选择余地
	public void run() {
		System.out.println("兔子跑的快");
	}

}
