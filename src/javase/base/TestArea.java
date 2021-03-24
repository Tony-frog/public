package javase.base;

public class TestArea {
	
	public static void main(String[] args) {
		//创建2个对象，字符串池中不存在，创建字符串"abc"，然后将字符串"abc"对象的地址给s1对象
				String s1 = "abc";	
				//创建1个对象，字符串池中判断依据存在"abc"，不再创建，直接把"abc"对象的地址给s2对象
				String s2 = "abc";
				
				//既然两个对象地址一样，当然结果就为true
				System.out.println("s1 == s2\t\t"+(s1 == s2));
				//值相同
				System.out.println("s1.equals(s2)\t"+s1.equals(s2));
				
				//创建2个对象，new String开辟地址空间，指向常量池"abc"地址，s3栈中
				String s3 = new String("abc");
				//创建2个对象，new String开辟地址空间，指向常量池"abc"地址，s4栈中
				String s4 = new String ("abc");
				
				System.out.println("s3 == s4\t\t"+(s3 == s4));
				//值相同
				System.out.println("s3.equals(s4)\t"+s3.equals(s4));

	}
}
