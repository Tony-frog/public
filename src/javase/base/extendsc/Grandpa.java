package javase.base.extendsc;

public class Grandpa {
	public Grandpa() {
		System.out.println("爷爷的默认构造");
	}
	
	//这个方法不想被继承
	//修饰符private私有，外部就不能访问，不能被继承
	private void oldAge() {
		System.out.println("我老了");
	}
	
	public void house() {
		System.out.println("房子给你了");
	}
}
