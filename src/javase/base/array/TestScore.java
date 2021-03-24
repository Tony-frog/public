package javase.base.array;

import java.util.Arrays;

/*
 * 业务需求：5次语文成绩，已知，
 * 1. 设置初始值 100,98,60,88,95
 * 2. 统计总分数
 * 3. 统计平均成绩
 * 4. 最好成绩
 * 5. 最差成绩
 */
public class TestScore {
	public static void main(String[] args) {
		//int[] scores = new int[5];
		//1. 声明时直接初始化，简写方式
		int[] scores = { 50, 120, 98, 60, 88, 95, 66, 0 };
		
		//2. 总分数
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			//sum = sum + scores[i];
			sum += scores[i];
		}
		System.out.println("总分数：" + sum);
		
		//3. 平均值
		System.out.println("平均值：" + sum/scores.length);
		
		//4. 排序
		Arrays.sort(scores);	//对这个数组进行排序，排序后的内容还放在这个数组中
//		for(int i=0; i< scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		String s = Arrays.toString(scores);
		System.out.println(s);
		
		//5. 最大值
		System.out.println("最大值：" + scores[scores.length-1]);
		
		//6. 最小值
		System.out.println("最小值：" + scores[0]);
	}
}





