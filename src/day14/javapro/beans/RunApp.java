package day14.javapro.beans;

import java.util.List;

import day14.javapro.beans.parse.ComponentScan;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����3:33:03
* @description ������
*/
public class RunApp {
	public static void main(String[] args) throws Exception {
		String scanDir = "D:\\java\\ws\\1907\\1907-javase\\bin\\day14\\";
		String baseDir = "D:\\java\\ws\\1907\\1907-javase\\bin\\";
		ComponentScan context = new ComponentScan();
		
		System.out.println("��һ������ɨ��");
		List<String> filenameList 
			= context.scan(baseDir, scanDir);
		
		System.out.println("\n�ڶ�����ת��������className");
		context.create(filenameList, baseDir);
	}
}
