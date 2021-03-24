package javase.base.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//导入对象的快捷键：Ctrl+Shift+o 批量导入，如果它能定下，直接就导入
//如果判断不了，就出现提示框

//处理文件
public class TestFile {
	public static void main(String[] args) throws IOException {
		TestFile tf = new TestFile();
		//tf.write();
		tf.read();
	}
	//1.写文件
	public void write() throws IOException{
		File file = new File("d:/a.txt");	//创建文件，文件保存在d盘，文件名a.txt
		//创建文件输出流
		OutputStream os = new FileOutputStream(file);
		
		//写文件内容
		String msg = "java培优真棒，\r\n高薪就业没问题!";
		os.write( msg.getBytes() );
		
		//释放资源，告诉gc垃圾回收器，这个对象已经没用，可以收回
		os.close();		//jdk1.7+自动释放
		System.out.println("创建文件完成");
	}
	
	//2.读文件
	public void read() throws IOException {
		File file = new File("d:/a.txt");
		//创建文件输入流
		InputStream is = new FileInputStream(file);
		//读文件只能一行一行读，
		byte[] buf = new byte[1024];	//按二进制方式读，流，一次批量读取1024字节=1m
		
		int len = 0;	//把读取内容长度存在len变量中
		while( (len = is.read(buf))  != -1 ) {	//不是-1就代表不是文件尾巴，就继续读
			System.out.write(buf, 0, len);
		}
		
		//释放资源
		is.close();
	}
}
