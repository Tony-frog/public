package day09.javase.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		//�淶������ӿڿ��������ĳ���������
		//��������ת��
		List<String> names = new ArrayList<String>();
		
		//����������Ԫ��
		names.add("����");
		names.add("��ѧ");
		names.add("Ӣ��");
		
		//���ϳ���
		System.out.println("���ϳ��ȣ�" + names.size() );
		
		//����
		for(String s : names) {
			System.out.println(s);
		}

		System.out.println("");
		//ɾ��delete���Ƴ�remove
		names.remove( names.size()-1 );	//ɾ�����һ��Ԫ��
		
		for(String s : names) {
			System.out.println(s);
		}
	}
}




