package javase.base.inner;

public class TestThread {
	public static void main(String[] args) {
		new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello thread");
			}
		}).start();
	}
}
