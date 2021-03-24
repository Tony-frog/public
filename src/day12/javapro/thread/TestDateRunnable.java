package day12.javapro.thread;

import java.text.ParseException;

public class TestDateRunnable implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println( DateUtilsThreadLocal.parse("1997-07-01"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Runnable target = new TestDateRunnable();
		
		for(int i=0; i<20; i++) {
			new Thread(target).start();
		}
	}
}
