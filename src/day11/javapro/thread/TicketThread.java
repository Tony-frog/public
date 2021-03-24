package day11.javapro.thread;

public class TicketThread  extends Thread{
	//��Ʊ��������̹߳���������������޸� ticket--
	private int ticket = 10;		
	
	//ִ��ҵ����д����run����
	@Override
	public void run() {
		//ҵ������Ʊ��Ʊ--
			while(true) {		//�̷߳ǳ��࣬���뾡��������Դ
				synchronized (this) {	//������
				//�ж�һ����������ȥ����
				if(ticket<=0) {	//���߳̿���ticket=-1
					break;		//�˳���ѭ��
				}
				
				//�����֣��߳�run����ִ��̫�죬���ᷢ���̳߳�ͻ
				try {	//�����׳��쳣���׳��Ͳ�����дrun����
					Thread.sleep(100);	//�ó�CPU������߳�Ҳ�л������
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("���ڣ�" + Thread.currentThread().getName() 
						+", ʣ��Ʊ����" + ticket-- );
			}
		}
	}
	
	//3�����ڶ�����һ��Ʊ
	public static void main(String[] args) {
		//Ŀ��
		Thread target = new TicketThread();
		
		for(int i=0; i<3; i++) {
			new Thread(target).start();		//3���̹߳�ͬ����һ��target
		}
	}
	
	//3�����ڸ�������
	public static void main3(String[] args) {
		//3���ڣ�����3���߳�
		int windows = 3;
		for(int i=0; i<windows; i++) {
			//�����̣߳��ȴ�OS����ϵͳ����
			new TicketThread().start();
			//new Thread().start();
		}
	}
}
