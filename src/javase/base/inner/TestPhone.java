package javase.base.inner;

public class TestPhone {
	public static void main(String[] args) {
		Phone phone = new Phone() {
			
			@Override
			public void call() {
				System.out.println("phone");
			}
		};
		phone.call();
	}
}
