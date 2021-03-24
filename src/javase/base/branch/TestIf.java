package javase.base.branch;

//if分支测试，测试男女
public class TestIf {
	//判断，如果是男，打印“挣钱”；如果是女，打印“花钱”
	public static void main(String[] args) {
//整个选中，快捷键Ctrl+/		
//		//条件表达式，要么为true，要么为false
//		String sex = "woman";
//		
//		//equals比较，sex变量和括号中的内容进行比较
//		System.out.println("条件是否成立："+sex.equals("man"));
//		//条件表达式，结果就2个，要么条件成立true，要么条件不成立false
//		if(sex.equals("man")) {
//			//真 Y
//			System.out.println("挣钱");
// 		}else {
//			//假 N
// 			System.out.println("花钱");
//		}
		
		
//		int score = 60;
//		//判断条件：大于等于90分
//		if(score>=90) {
//			System.out.println("优等");
//		}else {
//			//小于90分
//			System.out.println("一般");
//		}
		
		/*
		 * 
60分以下		不及格，
60~70		及格，
71~80		中等，
81~90		良好，
91~100		优秀
		 */

		int s = 99;
		String rtn = "";	//空字符串，返回信息
		
		if (s<60) {
			rtn = "不及格";
		} else if(s>=60 && s<=70){	//并列条件
			rtn = "及格";
		} else if(s>70 && s<=80) {
			rtn = "中等";
		} else if(s>80 && s<=90) {
			rtn = "良好";
		} else {
			rtn = "优秀";
		}
		System.out.println(rtn);
		
	}
}





