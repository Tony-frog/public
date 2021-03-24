package day10.javase.base;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;	//����
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author tony
 *
 */
public class TestGenerice {
	public static void main(String[] args) throws Exception {
		List<String> aList = new ArrayList<String>();
		aList.add("abc");
		//aList.add(100);		�����ڱ������ͼ��		
		
		//֤�����Ǹ��﷨�ǣ�ʵ��class�в����ڼ��
		//�����������ڶ������ж�ִ̬�� add��"abc"������
		
		/*
		 * �������裺
		 * 1�������ڻ�ȡ����ṹ��ֻ�����÷��似��
		 * 2������ǰ�ȱ����ȡ��ǰ����������
		 * 3����ȡList���淽�� add
		 * 4����ȡ����add����е��ã����������Ϊ���ص� invoke
		 * 5����100��ֵ
		 * 6���������List������ܴ�ӡ��100
		 * ֤������������ʱ�����ڣ�Ҳ�Ͳ������ͼ��
		 */
		
		Class<?> clazz = aList.getClass();	//���ݵ�ǰ�����ȡ����
		//��ȡ�������󣬼�����String�ֺ���Integer��ֻ��Object����
		Method m = clazz.getDeclaredMethod("add", Object.class);
		//����Ȩ��
		m.setAccessible(true);
		
		//��������������ص�
		//��һ��������add�����ĸ����󣬵ڶ�������add��������ֵ
		m.invoke(aList, 100);		// aList.add(100);
		
		//����
		for(Object o : aList) {
			System.out.println(o);
		}
	}
}
