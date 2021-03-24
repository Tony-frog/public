package javase.base.extends2;

//import javase.base.extendsc.Animal;

public class TestAbstract {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		
		//创建一个对象，默认同一个包下的文件的话，是不用import
		//如果类加入是有歧义，利用包路径指明
		//抽象类是不能实例化的话，不能new
		//Animal an  = new Animal();
	}
}
