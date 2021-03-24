package javase.base;

//交换两个变量的值
public class TestSwap {
	public static void main(String[] args) {
		int a = 10;	//声明一个整形变量，初始化值10
		int b = 20;	//声明一个整形变量，初始化值20
		
		System.out.println("a=" + a + " b=" + b);
		
		//声明一个中间临时变量，暂存a的值
		int t = b;
		
		//把a变量的值赋值给b变量，b变量的值就被覆盖
		b = a;
		
		//从临时暂存变量中获取事先保存的值
		a = t;
		
		System.out.println("a=" + a + " b=" + b);
	}
}
