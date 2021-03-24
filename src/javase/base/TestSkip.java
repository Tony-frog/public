package javase.base;

import org.junit.Test;

public class TestSkip {
	@Test
	public void testBreak(){
		System.out.println("\n测试 break");
		for(int i=0; i<6; i++) {
			if(i==3) {
				//退出循环
				break;
			}
			System.out.println(i);
		}
		System.out.println("执行完成");
	}
	
	@Test
	public void testContinue(){
		System.out.println("\n测试 continue");
		for(int i=0; i<6; i++) {
			if(i==3) {
				//跳过本次循环，执行下一次
				continue;
			}
			System.out.println(i);
		}
		System.out.println("执行完成");
	}
	
	@Test
	public void testReturn(){
		System.out.println("\n测试 return");
		for(int i=0; i<6; i++) {
			if(i==3) {
				//返回main，结束程序
				return;
			}
			System.out.println(i);
		}
		System.out.println("执行完成");
	}
}
