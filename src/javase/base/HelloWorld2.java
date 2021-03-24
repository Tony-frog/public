package javase.base;

//导入第三方jar支持，就是别人写好的工具类
import java.util.Date;		//千万别导入错了，牛头不对马嘴

public class HelloWorld2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println();
		
		System.out.println("==系统环境信息===========：");
		System.out.println("java的版本号："+System.getProperty("java.version"));
		System.out.println("java的所在目录："+System.getProperty("java.home"));
		
		System.out.println("所属的登录用户："+System.getProperty("user.name"));
		System.out.println("默认存储文件路径："+System.getProperty("user.dir"));
		
		System.out.println("当前毫秒数：" + System.currentTimeMillis());
		System.out.println("当前纳秒数：" + System.nanoTime());
		
		System.out.println("当前日期：" + new Date(0));
	}
}
