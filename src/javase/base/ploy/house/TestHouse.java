package javase.base.ploy.house;

public class TestHouse {
	public static void main(String[] args) {
		Master master = new Master();
		House house;
		
		System.out.println("\n==ûǮʱ==========");
		house = new SmallHouse();
		master.use(house);
		
		System.out.println("\n==��Ǯʱ==========");
		house = new LargeHouse();
		master.use(house);
	}
}
