package day13.javapro.junit4;
/**
* @author 作者：tony chan
* @version 创建时间：2019年8月16日 下午5:01:37
* @description 描述：
*/
public class Hello {
	@Test
	public void hello() {
		System.out.println("testHello");
	}
	
	@Test
	public void hi() {
		System.out.println("testHi");
	}
	
	public void hi(String name) {
		System.out.println("hi：" +name);
	}
}
