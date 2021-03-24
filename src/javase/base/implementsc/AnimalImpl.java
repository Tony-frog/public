package javase.base.implementsc;

//接口实现类，习惯规范：接口名称Impl
//建立和接口关系，必须实现接口的所有方法
public class AnimalImpl implements Animal{

	@Override
	public void eat() {
		System.out.println("吃饭了");
		
	}

	@Override
	public void run() {
		System.out.println("跑步了");
	}

}
