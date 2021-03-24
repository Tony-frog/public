package day09.javase.base;

public class TestString {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1==s2);				//true
		System.out.println(s1.equals(s2));		//true
		
		System.out.println(s3==s4);				//false
		System.out.println(s3.equals(s4));		//true
		
		//创建几个对象，
		//1. 堆中，"hello world"	//编译器优化
		//2. 栈中s
		
		String s = "hello" +  " world";
		System.out.println(s);
	}
}
