package day13.javapro.junit4;
/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺2019��8��16�� ����5:01:37
* @description ������
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
		System.out.println("hi��" +name);
	}
}
