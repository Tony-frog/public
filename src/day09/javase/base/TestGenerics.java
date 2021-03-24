package day09.javase.base;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
//		//它限定List集合中保存只能字符串类型
//		List<String> list = new ArrayList<String>();
//		list.add("abc");
//		list.add(123);		//编译阶段提示，写代码就不容易错误。
//		//编译期就检查，代码就不容出现bug
		
		List<String> sList = new ArrayList<String>();
		sList.add("语文");
		sList.add("数学");
		sList.add("英语");
		
		for(String s : sList) {
			System.out.println(s);
		}

		//目的：支持String,Integer....
		List list = new ArrayList();
		list.add(100.05);
		list.add(99.15);
		
		//泛型让程序更加灵活，如果不写类型，底层是按Object对待，
		//Object是所有类型父类，所有能接受字符串，整数
		for(Object s : list) {
			System.out.println(s);
		}
	}

	//
}
