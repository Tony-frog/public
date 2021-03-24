package javase.base;

import java.util.Date;
import org.junit.Test;


public class TestSystemEnv {
	@Test
	public void javaInfo() {
		System.out.println("==java��Ϣ===========");
		System.out.println("java�İ汾�ţ�"+System.getProperty("java.version"));
		System.out.println("java������Ŀ¼��"+System.getProperty("java.home"));
	}
	
	@Test
	public void userInfo() {
		System.out.println("\n==�û���Ϣ===========");
		System.out.println("�����ĵ�¼�û���"+System.getProperty("user.name"));
		System.out.println("Ĭ�ϴ洢�ļ�·����"+System.getProperty("user.dir"));
	}
	
	@Test
	public void dateTimeInfo() {
		System.out.println("\n==ʱ����Ϣ===========");
		System.out.println("��ǰ��������" + System.currentTimeMillis());
		System.out.println("��ǰ��������" + System.nanoTime());
		
		System.out.println("��ǰ���ڣ�" + new Date(0));
	}
}
