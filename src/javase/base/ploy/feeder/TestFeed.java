package javase.base.ploy.feeder;

public class TestFeed {
	public static void main(String[] args) {
		Feeder f = new Feeder();
		Animal animal;
		Food food;
		
		//给小猫吃小鱼
		food = new Fish("小银鱼");
		animal = new Cat();
		
		f.feed(animal, food);
		
		//给小猪吃米饭
		food = new Rice("白米饭");
		animal = new Pig();
		
		f.feed(animal, food);
	}
}
