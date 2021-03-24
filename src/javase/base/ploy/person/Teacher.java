package javase.base.ploy.person;

public class Teacher extends Person{

	@Override
	public void eat() {
		System.out.println("吃素的");
	}

	//个性方法
	public void teach() {
		System.out.println("教书");
	}
}
