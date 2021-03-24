package day11.javapro.thread;

//继承Thread类
public class TestThread extends Thread{
	
	//重写父类run()方法
	@Override
	public void run() {	//必须OS操作系统调度
		//打印线程名称，通过线程名称区别是哪个线程为我们服务
		//java线程类会自定义一个名字
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//启动线程，变成就绪状态
		//创建10个线程
		for(int i=0; i< 10; i++) {
			new TestThread().start();
		}
		
//		TestThread t1 = new TestThread();	//线程
//		TestThread t2 = new TestThread();	//线程
//		TestThread t3 = new TestThread();	//线程
//		
//		t1.start();		//启动是自己控制，run不是
//		t2.start();
//		t3.start();
		
		//得到结果是混乱? CPU时间片，我们启动只是就绪状态，
		//3个在“环”中，然后CPU挑中，不是按完全加入顺序，乱序
		//乱序
	}
}
