package day11.javapro.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreadPool {
	public static void main(String[] args) throws Exception {
		//利用ExecutorService，用的最多，固定线程数
		ExecutorService es = 
				Executors.newFixedThreadPool(5);
		//执行后创建一个线程池，池子里已经放好了5个线程
		//需要使用，直接从这个池子里获取
		//先创建对象，放入池中，优点：使用时，直接获取就无需创建对象，性能高
		//从池中获取对象，用完，又放回池中，其他直接获取使用
		
		//执行线程
//		es.submit(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println( Thread.currentThread().getName() );
//			}
//		});
//		
//		es.shutdown();		//释放资源
		
		//匿名，只使用一次，更加简洁
		Future<String> f = es.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println( Thread.currentThread().getName());
				String msg = Thread.currentThread().getName() +" 执行完成";
				return msg;
			}
		});
		
		//怎么获取返回值，get方法阻塞，不给我结果，我就等着
		String msg = f.get();
		System.out.println(msg);
	}
}



