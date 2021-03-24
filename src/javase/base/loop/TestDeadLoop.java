package javase.base.loop;

import org.junit.Test;

public class TestDeadLoop {
	@Test
	public void testFor() throws InterruptedException {
		for(;;) {
			//让程序延迟一会，看过程比较清晰
			Thread.sleep(500);		//单位毫秒数
			System.out.println("*");
		}
	}
	
	@Test
	public void testWhile() throws InterruptedException {
		while(true) {
			Thread.sleep(500);
			System.out.println("*");
		}
	}
}
