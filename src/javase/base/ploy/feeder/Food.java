package javase.base.ploy.feeder;

//食物本身类是没有实例化价值，它没有确定具体信息
public abstract class Food {
	private String name;	//具体食物名称

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
