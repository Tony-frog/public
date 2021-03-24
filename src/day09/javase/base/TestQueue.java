package day09.javase.base;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		//LinkedList本身双向列表
		//队列只能从尾巴新增元素
		Queue<String> queue = new LinkedList<String>();
		
		//入队 offer
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		
		//遍历
		for(String s : queue) {
			System.out.println(s);
		}
		
		//出队 poll
		String s = queue.poll();
		System.out.println(s);
		s = queue.poll();
		System.out.println(s);
	}
}
