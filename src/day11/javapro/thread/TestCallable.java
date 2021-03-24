package day11.javapro.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable<String>{

	@Override	//OS����ϵͳ���Զ�����call�൱��Threaf.run
	public String call() throws Exception {
		System.out.println( Thread.currentThread().getName() );

		//�Լ����Զ��巵��ֵ��ע����ν���
		String msg = Thread.currentThread().hashCode() +" ִ�гɹ�";
		return msg;
	}

	public static void main(String[] args) throws Exception {
		//Callable API���⣬��Runnable API��һ��
		Callable callable = new TestCallable();
		//�Ѵ����ӿ�Ҳ��Ϊ������Future���Ƿ�װ����ֵ
		
		//�����߳�
		for(int i=0; i<3; i++) {
			//����������棬���ͷ���ֵ�й�Future
			FutureTask<String> task = new FutureTask<String>(callable);
			new Thread(task).start();
			
			//��ν��շ���ֵ��run������������ִ�У����ᣬget������������
			String msg = task.get();	
			System.out.println("����ֵ��"+msg);
		}
	}
}
