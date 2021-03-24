package javase.base.loop;

public class TestDoWhile {
	public static void main(String[] args) {
		int j = 0;
		while(j<0) {		//条件不成立
			System.out.println(j);
			j++;
		}
		
		System.out.println("");
		
		int i = 0;
		do{	//不管条件是否成立最少执行一次
			System.out.println(i);
			i++;
		}while(i<0);
	}
}
