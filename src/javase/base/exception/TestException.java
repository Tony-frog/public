package javase.base.exception;

public class TestException {
	public static void main(String[] args) throws Exception{
		//主动制造异常
		//模拟输入密码不正确，而向上抛出异常
		
		try {
			String password = "123456";
			throw new Exception(""); 	//抛出异常
		} catch (Exception e) {	//捕获异常
			//主动抛出错误
			throw new Exception("密码错误! ");
		}
		
		//完美体现流程控制
		
		//僵尸代码，不可能执行 Unreachable code
		//System.out.println("完成了");	
		
	}
}
