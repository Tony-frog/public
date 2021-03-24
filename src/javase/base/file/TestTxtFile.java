package javase.base.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestTxtFile {
	// main称为入口，一个类只有一个入口，规定
	// main入口整个下面一行要求
	public static void main(String[] args) throws IOException {
		// 执行类中的read()方法
		// 1.创建类的对象，ttf对象实例
		TestTxtFile ttf = new TestTxtFile();

		// 2.调用类的 read();方法
		ttf.read();
		//ttf.write();

		// 方法上增加修饰符：static静态，可以不创建类而直接使用
		// TestTxtFile.read();
		// TestTxtFile.write();
	}

	// 写文本文件
	public void write() throws IOException {
		File file = new File("d:/b.txt");
		OutputStream os = new FileOutputStream(file);
		//输出对象，设置字符集：utf-8
		OutputStreamWriter writer =
				new OutputStreamWriter(os, "utf-8");
		BufferedWriter bw = new BufferedWriter(writer);

		// 写内容到磁盘文件中
		bw.write("java培优，\r\n高薪就业");

		// 释放资源
		bw.close();
		writer.close();
		os.close();
	}

	// 读文件
	public void read() throws IOException { // 方法
		File file = new File("d:/b.txt");
		InputStream is = new FileInputStream(file);
		InputStreamReader reader = 
				new InputStreamReader(is, "utf-8");
		BufferedReader br = new BufferedReader(reader);

		// 二进制文件按buf大小读，块。文本文件按行读，文件尾，null
		String s = ""; // 每次读取一行，把这一行数据保存字符串中
		while ((s = br.readLine()) != null) {
			System.out.println(s); // 打印
		}

		// 释放资源
		br.close();
		reader.close();
		is.close();
	}
}
