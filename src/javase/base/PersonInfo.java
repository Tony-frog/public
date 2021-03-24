package javase.base;

import java.util.Scanner;	//导包

public class PersonInfo {
	public static void main(String[] args) {
		//从键盘输入姓名
		/*
		 * String 字符串
		 * name 变量名，见名知意
		 * new 新建对象
		 * Scanner 代表键盘
		 * System.in 代表InputStream 输入流
		 * nextLine() 下一个值，录入暂时完成，回车前内容复制给name变量
		 * =赋值意思
		 */
		String name = new Scanner(System.in).nextLine();
		
		//键盘输入年龄，打印年龄，数字
		int age = new Scanner(System.in).nextInt();
		
		//公司信息
		String compony = new Scanner(System.in).nextLine();
		
		//字符串和整形相连接，结果是字符串
		System.out.println(name + " " + age + " " + compony);
	}
}




