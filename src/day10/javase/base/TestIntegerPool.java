package day10.javase.base;

public class TestIntegerPool {
	public static void main(String[] args) {
		Integer x1 = 100;		//引用类型，引用地址
		Integer y1 = 100;
		System.out.println(x1==y1);		//true
		
		Integer x2 = 200;		//超过-128~127范围，不在常量池，
		Integer y2 = 200;		//每次都new Integer()，新分配内存空间
		System.out.println(x2==y2);		//false
	}
}
