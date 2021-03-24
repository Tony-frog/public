package day09.javase.base;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<String> hSet = new HashSet<String>();
		
		//�����ظ�
		hSet.add("����");
		hSet.add("��ѧ");
		hSet.add("Ӣ��");
		hSet.add("����");
		
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
