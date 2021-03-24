package day11.javapro.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable<String>{

	@Override	//OS操作系统会自动调用call相当于Threaf.run
	public String call() throws Exception {
		System.out.println( Thread.currentThread().getName() );

		//自己可以定义返回值，注意如何接收
		String msg = Thread.currentThread().hashCode() +" 执行成功";
		return msg;
	}

	public static void main(String[] args) throws Exception {
		//Callable API特殊，和Runnable API不一样
		Callable callable = new TestCallable();
		//把创建接口也作为参数，Future就是封装返回值
		
		//启动线程
		for(int i=0; i<3; i++) {
			//必须放在里面，它和返回值有关Future
			FutureTask<String> task = new FutureTask<String>(callable);
			new Thread(task).start();
			
			//如何接收返回值，run方法不是立即执行，不会，get方法阻塞方法
			String msg = task.get();	
			System.out.println("返回值："+msg);
		}
	}
}
