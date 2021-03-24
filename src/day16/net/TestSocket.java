package day16.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author 作者：tony chan
 * @email 邮箱：chenzs@tedu.cn
 * @version v.1.0 创建时间：上午11:12:44
 * @description 描述：利用Socket去访问一个网站。爬虫
 */
public class TestSocket {
	public static void main(String[] args) throws Exception {
		/*
		 * 网络访问java世界归于流操作，类似文件操作 1）创建输出流，发送协议HTTP 2）GET访问网站 ：www.baidu.com，http1.1
		 * 3）标识：长链接 Connection: Keep-Alive 4）接收输入流，转成文字，while(( str = br.readLine) !=
		 * null) 5）打印
		 */

		String host = "www.baidu.com"; // 网址 http://www.tmooc.cn/
		host = "www.people.com.cn";
		int port = 80; // 网站默认端口号

		// 创建socket对象，用它才能网络通信
		Socket socket = new Socket(host, port);
		
		// 创建输出流，带Buffer的流
		// OutputStreamWriter参数必须从socket获取，否则没有关系
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter( 
						socket.getOutputStream()));
		
		// 模拟发起HTTP1.1协议，分成3步。语法必须写对
		// /代表请求网站根，其实请求/index.html，规范
		
		//http://finance.people.com.cn/n1/2019/0820/c1004-31306717.html?from=singlemessage&isappinstalled=0
		///n1/2019/0820/c1004-31306717.html
		bw.write("GET / HTTP/1.1\r\n");				//\r\n换行，代表多行命令
		//bw.write("GET /n1/2019/0820/c1004-31306717.html HTTP/1.1\r\n");				//\r\n换行，代表多行命令
		bw.write("Host: "+host+"\r\n");						//标识访问网站
		bw.write("Connection: Keep-Alive\r\n\r\n");		//长链接
		bw.flush();  //把缓存清空，把里面内容发出
		
		//接收返回值，返回值解决乱码：不知道，试：gbk早期/utf-8主流
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream(), "gbk"));	//国际化
		
		//每次一行，循环遍历
		String str = "";
		while(( str = br.readLine() ) != null ) {
			System.out.println(str);
		}
		
		//释放资源
		socket.close();
	}
}
