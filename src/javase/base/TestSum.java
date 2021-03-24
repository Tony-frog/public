package javase.base;

public class TestSum {
	public static void main(String[] args) {
		int a = 78;
		int b = 88;
		
		int sum1 = a + b;
		System.out.println("合计值："+sum1 );
		
		//抽取成方法（函数），方便重复调用
		int sum2 = TestSum.sum( a, b );
		System.out.println("合计值："+sum2);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
