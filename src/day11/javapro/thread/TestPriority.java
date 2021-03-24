package day11.javapro.thread;

public class TestPriority {
	public static void main(String[] args) {
		//数字越大优先级越高
		Thread t = new Thread();
		//默认优先级
		System.out.println(t.NORM_PRIORITY);
		
		//最小的优先级
		System.out.println(t.MIN_PRIORITY);
		
		//最大的优先级
		System.out.println(t.MAX_PRIORITY);
	}
}
