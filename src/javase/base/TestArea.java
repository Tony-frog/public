package javase.base;

public class TestArea {
	
	public static void main(String[] args) {
		//����2�������ַ������в����ڣ������ַ���"abc"��Ȼ���ַ���"abc"����ĵ�ַ��s1����
				String s1 = "abc";	
				//����1�������ַ��������ж����ݴ���"abc"�����ٴ�����ֱ�Ӱ�"abc"����ĵ�ַ��s2����
				String s2 = "abc";
				
				//��Ȼ���������ַһ������Ȼ�����Ϊtrue
				System.out.println("s1 == s2\t\t"+(s1 == s2));
				//ֵ��ͬ
				System.out.println("s1.equals(s2)\t"+s1.equals(s2));
				
				//����2������new String���ٵ�ַ�ռ䣬ָ������"abc"��ַ��s3ջ��
				String s3 = new String("abc");
				//����2������new String���ٵ�ַ�ռ䣬ָ������"abc"��ַ��s4ջ��
				String s4 = new String ("abc");
				
				System.out.println("s3 == s4\t\t"+(s3 == s4));
				//ֵ��ͬ
				System.out.println("s3.equals(s4)\t"+s3.equals(s4));

	}
}
