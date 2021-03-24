package javase.base.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 文件复制：打开一个文件，一块一块的读buffer
 * 把读取到的内容，写到另外一个文件
 */
public class TestCopyFile {
	/*
	 * 开发步骤：
	 * 1、源文件，目的文件
	 * 2、从源文件中读取内容，文件输入流
	 * 3、边读边写，防止内容过大，内存不够用
	 * 4、释放关闭资源
	 */
	public static void main(String[] args) throws IOException {
		TestCopyFile tcf = new TestCopyFile();
		File srcFile = new File("d:/jy2015.rar");
		File destFile = new File("d:/a1.rar");

		//执行时间？ start，end，耗时：end-start
		
		long start = System.currentTimeMillis();	//当前毫秒数
		tcf.copyFile(srcFile, destFile);
		long end = System.currentTimeMillis();
		
		System.out.println("耗时：" + (end-start) + " 毫秒");
	}
	
	//文件作为方法参数
	public void copyFile(File srcFile, File destFile)
			throws IOException {
		InputStream is = new FileInputStream( srcFile );
		OutputStream os = new FileOutputStream( destFile );
		
		byte[] buf = new byte[10240];	//10m
		
		int len = 0;
		//读文件
		while( (len = is.read(buf)) != -1) {
			//写文件
			os.write(buf, 0, len);
		}
		
		//释放资源，先释放里层的对象，在释放外层对象
		os.close();
		is.close();
	}
}






