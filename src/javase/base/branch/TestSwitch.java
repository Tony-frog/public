package javase.base.branch;

//分支
public class TestSwitch {
	public static void main(String[] args) {
		//需求：电话号码 110/120/119/114
		String phone = "158";
		String rtn = "";
		
		//switch有一个case成立后面就全都不判断，而且直接执行
		//判断这个变量值下面的对应处理
		switch (phone) {	
		case "110":
			rtn = "人民警察";
			break;	//执行完上面的内容，直接switch结束
		case "120":
			rtn = "医生护士";
			break;
		case "119":
			rtn = "火警电话";
			break;
		case "114":
			rtn = "人工查号";
			break;
		default:	//默认
			rtn = "非法电话";
			break;
		}
		System.out.println(rtn);
		
		
		//判断一个字符
		char c = 'c';	//char可以支持整数
		c = 101;		// ASCII 美国标准规定键盘字对应整数
						// a=97 bit=8个0或者1
		//为什么键盘输入会转换计算机能识别信息，就是ASCII
		
		System.out.println(c);
		
		switch(c) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		}
	}
	
}
