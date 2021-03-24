package day12.javapro.thread;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsThreadLocal {
	//�ײ㻹������SimpleDateFormat����������ThreadLocal
	private static final ThreadLocal<DateFormat> 
		threadlocal = new ThreadLocal<DateFormat>() {
			@Override	//ͨ�������ڲ�����Ϊ����
			protected DateFormat initialValue() {
				// ��ʼ��ֵ
				return new SimpleDateFormat("yyyy-MM-dd");
			}
		};
		
	public static Date parse(String s) throws ParseException {
		//��ThreadLocal�л�ȡ���󣬵��ö��󷽷�
		//���̷߳���ʱ��û�й�������ʹ���Լ����Ƹ���
		return threadlocal.get().parse(s);
	}
}
