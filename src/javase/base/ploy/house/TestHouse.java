package javase.base.ploy.house;

public class TestHouse {
	public static void main(String[] args) {
		Master master = new Master();
		House house;
		
		System.out.println("\n==没钱时==========");
		house = new SmallHouse();
		master.use(house);
		
		System.out.println("\n==有钱时==========");
		house = new LargeHouse();
		master.use(house);
	}
}
