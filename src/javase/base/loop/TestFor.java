package javase.base.loop;

public class TestFor {
	public static void main(String[] args) throws Exception {
		for(
				int i=0;			//第一步执行
				i<7;				//第二步执行
				i++					//第四步执行
			) {						
			System.out.println(i);	//第三步执行
		}
		
		int len = 10;
		for(int i=0;i<len;i++) {
			if(i%2==0) {	//奇数才能三角两边对齐
				continue;	
			}
			
			//前面空几个空格
			for(int k=0;k<((len-i)/2);k++)
				System.out.print(" ");
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			//一行输出完成后，输出换行
			System.out.println();
		}

	}
}
