package day13.javapro.reflect;
public class Hello {
	private Integer id = 10;
	public String name = "tony";
	
	//ͨ������������
	public Hello() {	
		System.out.println("Ĭ�Ϲ���");
	}
	
	public Hello(String name) {
		System.out.println("�вι��죺" + name);
	}
	
	//��ͨ�������ص�
	public void show() {
		System.out.println("show() : "+name);
	}
	
	public void show(String name) {
		System.out.println("show() ��" + name);
	}
}
