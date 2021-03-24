package javase.base.extendsc;

public class TestSon {
	public static void main(String[] args) {
		Son son = new Son();
		//son.oldAge();	//私有后这个方法就不能被继承
		son.house();
		son.money();
		son.play();
		
		System.out.println(son.getClass()); 	//全路径，全局限定名
		//class javase.base.extendsc.Son
		//获取所有类的父类 super超级，父类
		System.out.println( son.getClass().getSuperclass() );
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass() );
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass().getSuperclass() );
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass().getSuperclass()
				.getSuperclass()
				);
		//创建对象没有初始化时null，如果对null变量进行访问抛出异常：空指针
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass().getSuperclass()
				.getSuperclass().getSuperclass()
				);		
	}
}
