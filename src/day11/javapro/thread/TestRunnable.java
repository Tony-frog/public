package day11.javapro.thread;

public class TestRunnable implements Runnable{

	@Override	//����run()������ҵ�������������м���
	public void run() {
		System.out.println( Thread.currentThread().getName() );
	}
	
	public static void main(String[] args) {
		//����ӿڿ���
		Runnable target = new TestRunnable();
		
		//����10�߳�
		for(int i =0; i<10; i++) {
			//�ѽӿ���Ϊ���������Ͷ�̬Ӧ�ã�ʵ������ϼܹ�
			new Thread(target).start();	
		}
	}

}
