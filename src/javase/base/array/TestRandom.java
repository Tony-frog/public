package javase.base.array;

import java.util.Random;		//导入jar中类

public class TestRandom {
	public static void main(String[] args)  throws Exception{
		//引用类型，复杂对象都通过 new 方式声明
		int[] arr = new int[50];	//声明一个int数组，数组大小，只能放5个
		System.out.println("数组长度：" + arr.length);
		
		//给数组每个元素来一个随机值，引入工具类Random
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Random().nextInt(20);		//随机数，1~10的范围内整数
			System.out.println( arr[i] );
		}
	}
}
