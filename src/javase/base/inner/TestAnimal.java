package javase.base.inner;

public class TestAnimal {
	public static void main(String[] args) {
		Animal an = new Animal() {
			
			@Override
			public void jump() {
				System.out.println("high");
			}
		};
		an.jump();
	}
}
