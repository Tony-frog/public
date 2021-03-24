package javase.base.ploy.feeder;

public interface Animal {
	//小动物要根据它自身特点来喂食
	//确定不了具体吃Fish还是Rise
	public void eat(Food food);
	final public String name = null;
}
