package javase.base.ploy.person;

public class Student extends Person{

	@Override
	public void eat() {
		System.out.println("吃肉肉");
	}

	//个性方法
	public void study() {
		System.out.println("学习");
	}
}
