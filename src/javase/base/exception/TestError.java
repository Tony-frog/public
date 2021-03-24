package javase.base.exception;

public class TestError {	//throws就来接收抛出的异常
	public static void main(String[] args) throws Exception{
		//自己处理异常
		
		String name = "tony";
		try {
			//把可能出现的异常的代码放在try{}
			int i = 3/0;	//非法，编译没有错
			System.out.println(i);
		} catch (Exception e) {	//捕获异常，Exception总异常爹
			//自己处理所发生的异常，不发生异常
			
			
			//打印异常信息，都是给开发人员看的
			//微缩版。getMessage()获取异常信息
			//System.out.println(e.getMessage());
			
			//详细信息，Stack异常栈信息，栈存储异常信息容器
			//e.printStackTrace();
			
			//给用户看，提示用户好理解
			String msg = "系统异常，请联系管理员!";
			//把异常转换后抛出，抛出给系统的调用者
			throw new Exception(msg);
		}
		
	}
}
