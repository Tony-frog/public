package day10.javase.base;

public class TestIntegerPool {
	public static void main(String[] args) {
		Integer x1 = 100;		//�������ͣ����õ�ַ
		Integer y1 = 100;
		System.out.println(x1==y1);		//true
		
		Integer x2 = 200;		//����-128~127��Χ�����ڳ����أ�
		Integer y2 = 200;		//ÿ�ζ�new Integer()���·����ڴ�ռ�
		System.out.println(x2==y2);		//false
	}
}
