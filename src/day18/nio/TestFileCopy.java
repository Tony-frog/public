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
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：下午3:28:59
* @description 描述：BIO和NIO文件拷贝
*/
public class TestFileCopy {
	@Test	//bio		耗时：21794，耗时：4484，耗时：2654
	public void bio() throws Exception {
		//计时，记录系统毫秒数
		long start = System.currentTimeMillis();
		
		//输入流，读取文件
		InputStream is = new FileInputStream(
				new File("d:/gs.mp4"));
		
		//输出流，写文件
		OutputStream out = new FileOutputStream(
				new File("d:/a.mp4"));
		
		//从输入流读取内容
		byte[] buf = new byte[1024000];		//缓存1m
		int len = 0;	//每次读取长度，文件结束-1
		while( (len = is.read(buf)) != -1 ) {
			//写文件，读多少，写多少
			out.write(buf, 0, len);
		}
		
		//文件释放资源
		out.close();
		is.close();
		
		long end = System.currentTimeMillis();
		System.out.println("耗时："+ (end - start) );
	}
	
	@Test	//nio，Channel通道，复用，耗时：657
	public void nio() throws Exception {
		long start = System.currentTimeMillis();
		
		//读源文件
		FileChannel fcFrom = 
				FileChannel.open(Paths.get("d:/gs.mp4"), 
						StandardOpenOption.READ);
		//写文件
		FileChannel fcTo =
				FileChannel.open(Paths.get("d:/b.mp4"), 
						StandardOpenOption.READ,
						StandardOpenOption.WRITE,
						StandardOpenOption.CREATE_NEW);
		
		//复制文件，从0开始到源文件长度复制，整个文件
		fcTo.transferFrom(fcFrom, 0, fcFrom.size());
		
		long end = System.currentTimeMillis();
		System.out.println("耗时："+(end-start));
	}
}
