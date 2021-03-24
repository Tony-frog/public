package javase.base.extendsc;

public class TestExtends {
	//代码问题？没有复用
	public static void main(String[] args) {
//		Tiger tiger = new Tiger();
//		tiger.eat();		//先在自己的类中找这个方法，如果找不到父类中去找
//		tiger.run();
//		
		Eagle eagle = new Eagle();
		eagle.eat();		//父亲父亲
		eagle.run();		//父亲
		eagle.fly();			//自己
	}
}
