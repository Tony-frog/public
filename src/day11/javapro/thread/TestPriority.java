package day11.javapro.thread;

public class TestPriority {
	public static void main(String[] args) {
		//����Խ�����ȼ�Խ��
		Thread t = new Thread();
		//Ĭ�����ȼ�
		System.out.println(t.NORM_PRIORITY);
		
		//��С�����ȼ�
		System.out.println(t.MIN_PRIORITY);
		
		//�������ȼ�
		System.out.println(t.MAX_PRIORITY);
	}
}
