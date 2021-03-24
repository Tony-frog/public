package day12.javapro.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//���ڹ����࣬�ַ���ת����������
public class DateUtils {
	//���̲߳���������Ա�����������̷߳ǰ�ȫ
	private static final SimpleDateFormat df = 
			new SimpleDateFormat("yyyy-MM-dd");
	
	//ת������
	synchronized public static Date parse(String s) throws ParseException {
		return df.parse(s);
	}
}
