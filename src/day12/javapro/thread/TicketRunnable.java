package day12.javapro.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TicketRunnable implements Runnable {
	// ��Ա����������
	private int ticket = 10;

	// ����������
	private static final ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock(true);

	@Override // ����3�����ڣ�һ����10��Ʊ
	public void run() {
		while (true) {
			// ����
			try {
				rwlock.writeLock().lock();
				// ������ǿռ��Դ��CPU�л�����ȥ��
				// ��������
				if (ticket <= 0) {
					break;
				}

				// ģ��ҵ��ִ��ʱ��Ƚϳ����ͻ�������̲߳������⣬Ҳ��Ϊ�̰߳�ȫ
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "�� ��Ʊ��" + ticket--);
			} catch (Exception e) {
				e.printStackTrace(); // �������쳣����ӡ�쳣��ϸ��Ϣ
			} finally {	//���������û���ͷţ���ռ����Դ���ͷţ��ڴ����
				// ����ִ���������ǲ���������Ҫ�ͷ���
				rwlock.writeLock().unlock();
			}
		}

	}

	// ִ��
	public static void main(String[] args) {
		// ִ��˭��target/task
		Runnable target = new TicketRunnable();

		for (int i = 0; i < 3; i++) {
			// �ı��߳�����
			new Thread(target, "����" + (i + 1)).start();
		}
	}
}
