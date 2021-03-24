package day11.javapro.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TicketLock implements Runnable {
	private int ticket = 10;
	
	//jdk1.6ǰ�����ܲ���ܴ�1.6��synchronized�ײ�ʵ������Lock�����ܲ���֮��
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
				System.out.println("�̣߳�" + Thread.currentThread().getName() + "����ʣƱ����" + ticket--);
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				lock.writeLock().unlock();	//��ֹ���������Զ��ͷţ���synchronized�����ͷ�
			}
		}
	}

	public static void main(String[] args) {
		Runnable target = new TicketLock ();
		int windows = 3; 	// ��������

		for (int i = 1; i < windows + 1; i++) {
			new Thread(target, "����" + i).start();
		}
	}
}
