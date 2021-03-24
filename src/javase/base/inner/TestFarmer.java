package javase.base.inner;

public class TestFarmer {
	public static void main(String[] args) {
		Farmer f = new Farmer();
		f.plant(new Fruit() {
			
			@Override
			public void plant() {
				System.out.println("ÖÖÖ²" + this.getName());
			}
			
			@Override
			public String getName() {
				return "ÂÜ²·";
			}
		});
	}
}
