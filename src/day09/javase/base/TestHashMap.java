package day09.javase.base;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		//����һ��HashMap����
		Map<String, Integer> map = new HashMap<String, Integer>();
		//����Ԫ�أ�hash()%n�㷨����ɢ�У���������
		map.put("����", 100);
		map.put("��ѧ", 99);
		map.put("����", 60);		//kv��ֵ��

		//��ȡһ��ֵ
		Integer score = map.get("����");
		System.out.println(score);
		
		//��������ȡ�������е�key������keyȥ��ȡ����Ӧֵ
		//hash%n�㷨������ά���ɱ��ͣ����ܸ�
		for(String key : map.keySet()) { 	//��map��ȡ����key�ļ���
			System.out.print("key=" + key);
			System.out.println(", value=" + map.get(key));
		}
		
		
	}
}
