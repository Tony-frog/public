package day09.javase.base;

public class TestIntegerPool {
	public static void main(String[] args) {
		Integer x1 = 100;
		Integer y1 = 100;
		System.out.println(x1==y1);
		
		Integer x2 = 200;
		Integer y2 = 200;
		System.out.println(x2==y2);
	}
}
