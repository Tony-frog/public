package day12.javapro.thread;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsThreadLocal {
	//底层还是利用SimpleDateFormat，把它放入ThreadLocal
	private static final ThreadLocal<DateFormat> 
		threadlocal = new ThreadLocal<DateFormat>() {
			@Override	//通过匿名内部类作为参数
			protected DateFormat initialValue() {
				// 初始化值
				return new SimpleDateFormat("yyyy-MM-dd");
			}
		};
		
	public static Date parse(String s) throws ParseException {
		//从ThreadLocal中获取对象，调用对象方法
		//多线程访问时，没有共享，而是使用自己复制副本
		return threadlocal.get().parse(s);
	}
}
