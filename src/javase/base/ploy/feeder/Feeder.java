package javase.base.ploy.feeder;

public class Feeder {
	//喂养小动物
	public void feed(Animal animal, Food food) {
		//某个小动物，吃某个食物，动态运行时来确定
		animal.eat(food);
	}
}
