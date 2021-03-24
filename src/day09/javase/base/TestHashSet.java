package day09.javase.base;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<String> hSet = new HashSet<String>();
		
		//不能重复
		hSet.add("语文");
		hSet.add("数学");
		hSet.add("英语");
		hSet.add("语文");
		
		for(String s : hSet) {
			System.out.println(s);
		}
		
		//乱序
		for(int i=0;i<30;i++) {
			hSet.add(i+"");
		}
		
		for(String s : hSet) {
			System.out.println(s);
		}
	}
}
