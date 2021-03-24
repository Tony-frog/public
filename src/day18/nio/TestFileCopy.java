package day18.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����3:28:59
* @description ������BIO��NIO�ļ�����
*/
public class TestFileCopy {
	@Test	//bio		��ʱ��21794����ʱ��4484����ʱ��2654
	public void bio() throws Exception {
		//��ʱ����¼ϵͳ������
		long start = System.currentTimeMillis();
		
		//����������ȡ�ļ�
		InputStream is = new FileInputStream(
				new File("d:/gs.mp4"));
		
		//�������д�ļ�
		OutputStream out = new FileOutputStream(
				new File("d:/a.mp4"));
		
		//����������ȡ����
		byte[] buf = new byte[1024000];		//����1m
		int len = 0;	//ÿ�ζ�ȡ���ȣ��ļ�����-1
		while( (len = is.read(buf)) != -1 ) {
			//д�ļ��������٣�д����
			out.write(buf, 0, len);
		}
		
		//�ļ��ͷ���Դ
		out.close();
		is.close();
		
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��"+ (end - start) );
	}
	
	@Test	//nio��Channelͨ�������ã���ʱ��657
	public void nio() throws Exception {
		long start = System.currentTimeMillis();
		
		//��Դ�ļ�
		FileChannel fcFrom = 
				FileChannel.open(Paths.get("d:/gs.mp4"), 
						StandardOpenOption.READ);
		//д�ļ�
		FileChannel fcTo =
				FileChannel.open(Paths.get("d:/b.mp4"), 
						StandardOpenOption.READ,
						StandardOpenOption.WRITE,
						StandardOpenOption.CREATE_NEW);
		
		//�����ļ�����0��ʼ��Դ�ļ����ȸ��ƣ������ļ�
		fcTo.transferFrom(fcFrom, 0, fcFrom.size());
		
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��"+(end-start));
	}
}
