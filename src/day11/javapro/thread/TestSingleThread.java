package day11.javapro.thread;

public class TestSingleThread {
	public static void main(String[] args) {
		TestSingleThread.exec();
	}
	
	public static void exec() {
		System.out.println("exec start");
		fn1();
		
		fn2();
		System.out.println("exec end");
	}
	
	public static void fn1() {
		System.out.println("fn1");
	}
	
	public static void fn2() {
		System.out.println("fn2");
	}
}
