package javase.base;

public class TestSum {
	public static void main(String[] args) {
		int a = 78;
		int b = 88;
		
		int sum1 = a + b;
		System.out.println("�ϼ�ֵ��"+sum1 );
		
		//��ȡ�ɷ������������������ظ�����
		int sum2 = TestSum.sum( a, b );
		System.out.println("�ϼ�ֵ��"+sum2);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
