package day11.javapro.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreadPool {
	public static void main(String[] args) throws Exception {
		//����ExecutorService���õ���࣬�̶��߳���
		ExecutorService es = 
				Executors.newFixedThreadPool(5);
		//ִ�к󴴽�һ���̳߳أ��������Ѿ��ź���5���߳�
		//��Ҫʹ�ã�ֱ�Ӵ�����������ȡ
		//�ȴ������󣬷�����У��ŵ㣺ʹ��ʱ��ֱ�ӻ�ȡ�����贴���������ܸ�
		//�ӳ��л�ȡ�������꣬�ַŻس��У�����ֱ�ӻ�ȡʹ��
		
		//ִ���߳�
//		es.submit(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println( Thread.currentThread().getName() );
//			}
//		});
//		
//		es.shutdown();		//�ͷ���Դ
		
		//������ֻʹ��һ�Σ����Ӽ��
		Future<String> f = es.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println( Thread.currentThread().getName());
				String msg = Thread.currentThread().getName() +" ִ�����";
				return msg;
			}
		});
		
		//��ô��ȡ����ֵ��get���������������ҽ�����Ҿ͵���
		String msg = f.get();
		System.out.println(msg);
	}
}



