package day12.javapro.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//日期工具类，字符串转成日期类型
public class DateUtils {
	//多线程并发，它成员变量，共享，线程非安全
	private static final SimpleDateFormat df = 
			new SimpleDateFormat("yyyy-MM-dd");
	
	//转换方法
	synchronized public static Date parse(String s) throws ParseException {
		return df.parse(s);
	}
}
