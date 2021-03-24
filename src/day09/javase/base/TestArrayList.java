package day09.javase.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		//规范：面向接口开发，它的程序更加灵活
		//体现向上转型
		List<String> names = new ArrayList<String>();
		
		//给集合新增元素
		names.add("语文");
		names.add("数学");
		names.add("英语");
		
		//集合长度
		System.out.println("集合长度：" + names.size() );
		
		//遍历
		for(String s : names) {
			System.out.println(s);
		}

		System.out.println("");
		//删除delete，移除remove
		names.remove( names.size()-1 );	//删除最后一个元素
		
		for(String s : names) {
			System.out.println(s);
		}
	}
}




