package javase.base.ploy.car;

public class SellCar {
	//累加，成员变量
	private Integer money = 0;
	
	//卖车
	public void sell(Car car) {
		//%s占位符，不是真正最终内容，它要被替换
		String s = String.format("型号：%s , 价格：%s", 
				car.getName(), car.getPrice());
		
		System.out.println(s);
		
		money += car.getPrice();
	}
	
	//销售总额
	public Integer getMoney() {
		return this.money;
	}
}
