package javase.base.extendsc;

public class B extends A{
	//和父类方法：方法名一致，返回值类型一致，参数个数一致，参数类型一致
	//也称为覆盖、重写 overide，重写后程序有没有安全问题！
	public String show(String name) {
		System.out.println("B.show " +name);
		return name+" 123";
	}
	
	public void exe() {
		show("tony");
	}
	
	//在子类中调用父类
	public void execute() {
		
		//此时show是父类？子类？
		//String name = "tony";
		String name = show("tony");
		System.out.println(name);
		
		//要明确调用自己的show方法 this
		System.out.println("this=");
		this.show(name);
		
		//this.getClass().getSuperclass()
		//要明确调用父类的show方法
		super.show123("hellen");
	}
	
	public static void main(String[] args) {
		B b = new B();
		//b.execute();
		
		b.exe();
	}
}
