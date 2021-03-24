package day11.javapro.thread;

public class TestRunnable implements Runnable{

	@Override	//调用run()方法，业务放在这个方法中即可
	public void run() {
		System.out.println( Thread.currentThread().getName() );
	}
	
	public static void main(String[] args) {
		//面向接口开发
		Runnable target = new TestRunnable();
		
		//并发10线程
		for(int i =0; i<10; i++) {
			//把接口作为参数，典型多态应用，实现松耦合架构
			new Thread(target).start();	
		}
	}

}
