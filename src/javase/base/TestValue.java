package javase.base;

public class TestValue {
	public static void main(String[] args) {
		//变量 variable
		boolean b = false;
		System.out.println("布尔类型：" + b);

		char c = ' ';
		System.out.println("字符类型：" + "-"+c+"-");
		
		byte t = 0;
		System.out.println("字节类型：" + t);
		
		short s = 0;
		System.out.println("短整型：" + s);
		
		int i = 0;
		System.out.println("整型：" + i);
		
		long l = 0;
		System.out.println("长整型：" + l);
		
		float f = 0.0f;
		System.out.println("单精度浮点型：" + f);
		
		double d = 0.0d;
		System.out.println("双单精度浮点型：" + d);
		
		System.out.println();
		
		//常量 const
		final double PI = 3.14d;
		System.out.println("圆周率：" + d);
		
		final double GOLDEN_SECTION = 0.618d;
		System.out.println("黄金分割线：" + d);
	}
}
