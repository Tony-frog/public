package day11.javapro.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TicketLock implements Runnable {
	private int ticket = 10;
	
	//jdk1.6前，性能差异很大，1.6后synchronized底层实现类似Lock，性能伯仲之间
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

	@Override
	public void run() {
		while (true) {
			try {
				lock.writeLock().lock();
				
				if (ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("线程：" + Thread.currentThread().getName() + "，还剩票数：" + ticket--);
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				lock.writeLock().unlock();	//防止死锁，会自动释放，而synchronized不会释放
			}
		}
	}

	public static void main(String[] args) {
		Runnable target = new TicketLock ();
		int windows = 3; 	// 窗口数量

		for (int i = 1; i < windows + 1; i++) {
			new Thread(target, "窗口" + i).start();
		}
	}
}
