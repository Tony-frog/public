package day12.javapro.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TicketRunnable implements Runnable {
	// 成员变量，共享
	private int ticket = 10;

	// 创建锁对象
	private static final ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock(true);

	@Override // 开启3个窗口，一起买10张票
	public void run() {
		while (true) {
			// 加锁
			try {
				rwlock.writeLock().lock();
				// 尽量的强占资源，CPU切换别人去了
				// 超卖现象
				if (ticket <= 0) {
					break;
				}

				// 模拟业务执行时间比较长，就会产生多线程并发问题，也称为线程安全
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "， 售票：" + ticket--);
			} catch (Exception e) {
				e.printStackTrace(); // 不处理异常，打印异常详细信息
			} finally {	//如果加锁后没有释放，独占，资源不释放，内存溢出
				// 不管执行正常还是不正常，都要释放锁
				rwlock.writeLock().unlock();
			}
		}

	}

	// 执行
	public static void main(String[] args) {
		// 执行谁？target/task
		Runnable target = new TicketRunnable();

		for (int i = 0; i < 3; i++) {
			// 改变线程名称
			new Thread(target, "窗口" + (i + 1)).start();
		}
	}
}
