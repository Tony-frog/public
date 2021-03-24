package javase.base.ploy.car;

public class TestCar {
	public static void main(String[] args) {
		SellCar sellCar = new SellCar();
		Car car;
		//在参数上体系多态，不同形式，运行时才知道，也称为动态绑定
		
		car = new BMW();
		sellCar.sell(car);
		
		car = new HG();
		sellCar.sell(car);
		
		car = new BMW();
		sellCar.sell(car);
		
		Integer money = sellCar.getMoney();
		System.out.println(String.format("\n总的销售额：%s", money));
	}
}
