package day09.javase.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day13.javapro.junit4.Test;

public class TestListAndSet {
	@Test
	public void list() {
		List<String> aList = new ArrayList<String>();
		
		//�����ظ�
		aList.add("a");
		aList.add("a");
		aList.add("b");

		for(String s : aList) {
			System.out.println(s);
		}
		
		//˳��
		for(int i=0;i<30;i++) {
			aList.add(i+"");
		}
		
		for(String s : aList) {
			System.out.println(s);
		}
	}
	
	@Test
	public void set() {
		Set<String> hSet = new HashSet<String>();
		
		//�����ظ�
		hSet.add("a");
		hSet.add("a");
		hSet.add("b");
		
		for(String s : hSet) {
			System.out.println(s);
		}
		
		//����
		for(int i=0;i<30;i++) {
			hSet.add(i+"");
		}
		
		for(String s : hSet) {
			System.out.println(s);
		}
	}
}
