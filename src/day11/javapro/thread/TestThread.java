package day11.javapro.thread;

//�̳�Thread��
public class TestThread extends Thread{
	
	//��д����run()����
	@Override
	public void run() {	//����OS����ϵͳ����
		//��ӡ�߳����ƣ�ͨ���߳������������ĸ��߳�Ϊ���Ƿ���
		//java�߳�����Զ���һ������
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		//�����̣߳���ɾ���״̬
		//����10���߳�
		for(int i=0; i< 10; i++) {
			new TestThread().start();
		}
		
//		TestThread t1 = new TestThread();	//�߳�
//		TestThread t2 = new TestThread();	//�߳�
//		TestThread t3 = new TestThread();	//�߳�
//		
//		t1.start();		//�������Լ����ƣ�run����
//		t2.start();
//		t3.start();
		
		//�õ�����ǻ���? CPUʱ��Ƭ����������ֻ�Ǿ���״̬��
		//3���ڡ������У�Ȼ��CPU���У����ǰ���ȫ����˳������
		//����
	}
}
