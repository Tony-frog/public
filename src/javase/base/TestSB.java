package javase.base;

import org.junit.Test;

public class TestSB {
private final static int count = 100000;
	
	@Test
	public void testString() {
		String s = "";
		long start = System.currentTimeMillis();
		for(int i=0;i<count;i++) {
			s += "a";
		}
		long end = System.currentTimeMillis();
		
		System.out.println("String 执行时间：" + (end-start));
		System.out.println(s.length());
	}
	
	@Test
	public void testStringBuffer() {
		StringBuffer sb = new StringBuffer();
		long start = System.currentTimeMillis();
		for(int i=0; i<count; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("StringBuffer 执行时间：" + (end-start));
		System.out.println(sb.length());
	}
	
	@Test
	public void testStringBuilder() {
		StringBuilder sb = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i=0; i<count; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("StringBuilder 执行时间：" + (end-start));
		System.out.println(sb.length());
	}

}
