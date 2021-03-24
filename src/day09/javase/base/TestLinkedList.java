package day09.javase.base;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		names.add("ÓïÎÄ");
		names.add("ÊıÑ§");
		names.add("Ó¢Óï");
		
		//É¾³ı£¬ÒÆ³ı
		names.remove(0);
		
		//±éÀú
		for(String s : names) {
			System.out.println(s);
		}
	}
}
