package day09.javase.base;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		names.add("����");
		names.add("��ѧ");
		names.add("Ӣ��");
		
		//ɾ�����Ƴ�
		names.remove(0);
		
		//����
		for(String s : names) {
			System.out.println(s);
		}
	}
}
