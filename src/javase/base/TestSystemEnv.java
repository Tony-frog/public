package javase.base;

import java.util.Date;
import org.junit.Test;


public class TestSystemEnv {
	@Test
	public void javaInfo() {
		System.out.println("==java信息===========");
		System.out.println("java的版本号："+System.getProperty("java.version"));
		System.out.println("java的所在目录："+System.getProperty("java.home"));
	}
	
	@Test
	public void userInfo() {
		System.out.println("\n==用户信息===========");
		System.out.println("所属的登录用户："+System.getProperty("user.name"));
		System.out.println("默认存储文件路径："+System.getProperty("user.dir"));
	}
	
	@Test
	public void dateTimeInfo() {
		System.out.println("\n==时间信息===========");
		System.out.println("当前毫秒数：" + System.currentTimeMillis());
		System.out.println("当前纳秒数：" + System.nanoTime());
		
		System.out.println("当前日期：" + new Date(0));
	}
}
