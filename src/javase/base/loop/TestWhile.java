package javase.base.loop;

public class TestWhile {
	
	
	public static void main(String[] args) {
		//while结构，也要初始值，也有判断条件，一定要改变条件
		int i = 0;	//和for循环不同的是，初始化条件在while前面
		
		//for(int i=0;i<10;i++){}
		while(i<10) {	//判断条件
			if(i==6) {
				
				//直接退出
				//break;	//快速中断执行
				//return;	//结束程序
				continue;	//继续执行
			}			
			//方法体内改变值
			System.out.println(i);
			i++;

		}
		System.out.println("执行完成");
	}
}
