package day09.javase.base;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	public static void main(String[] args) {
//		//���޶�List�����б���ֻ���ַ�������
//		List<String> list = new ArrayList<String>();
//		list.add("abc");
//		list.add(123);		//����׶���ʾ��д����Ͳ����״���
//		//�����ھͼ�飬����Ͳ��ݳ���bug
		
		List<String> sList = new ArrayList<String>();
		sList.add("����");
		sList.add("��ѧ");
		sList.add("Ӣ��");
		
		for(String s : sList) {
			System.out.println(s);
		}

		//Ŀ�ģ�֧��String,Integer....
		List list = new ArrayList();
		list.add(100.05);
		list.add(99.15);
		
		//�����ó�������������д���ͣ��ײ��ǰ�Object�Դ���
		//Object���������͸��࣬�����ܽ����ַ���������
		for(Object s : list) {
			System.out.println(s);
		}
	}

	//
}
