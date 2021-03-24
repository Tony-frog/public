package day09.javase.base;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		//LinkedList����˫���б�
		//����ֻ�ܴ�β������Ԫ��
		Queue<String> queue = new LinkedList<String>();
		
		//��� offer
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		
		//����
		for(String s : queue) {
			System.out.println(s);
		}
		
		//���� poll
		String s = queue.poll();
		System.out.println(s);
		s = queue.poll();
		System.out.println(s);
	}
}
