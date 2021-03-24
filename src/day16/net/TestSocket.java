package day16.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author ���ߣ�tony chan
 * @email ���䣺chenzs@tedu.cn
 * @version v.1.0 ����ʱ�䣺����11:12:44
 * @description ����������Socketȥ����һ����վ������
 */
public class TestSocket {
	public static void main(String[] args) throws Exception {
		/*
		 * �������java��������������������ļ����� 1�����������������Э��HTTP 2��GET������վ ��www.baidu.com��http1.1
		 * 3����ʶ�������� Connection: Keep-Alive 4��������������ת�����֣�while(( str = br.readLine) !=
		 * null) 5����ӡ
		 */

		String host = "www.baidu.com"; // ��ַ http://www.tmooc.cn/
		host = "www.people.com.cn";
		int port = 80; // ��վĬ�϶˿ں�

		// ����socket����������������ͨ��
		Socket socket = new Socket(host, port);
		
		// �������������Buffer����
		// OutputStreamWriter���������socket��ȡ������û�й�ϵ
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter( 
						socket.getOutputStream()));
		
		// ģ�ⷢ��HTTP1.1Э�飬�ֳ�3�����﷨����д��
		// /����������վ������ʵ����/index.html���淶
		
		//http://finance.people.com.cn/n1/2019/0820/c1004-31306717.html?from=singlemessage&isappinstalled=0
		///n1/2019/0820/c1004-31306717.html
		bw.write("GET / HTTP/1.1\r\n");				//\r\n���У������������
		//bw.write("GET /n1/2019/0820/c1004-31306717.html HTTP/1.1\r\n");				//\r\n���У������������
		bw.write("Host: "+host+"\r\n");						//��ʶ������վ
		bw.write("Connection: Keep-Alive\r\n\r\n");		//������
		bw.flush();  //�ѻ�����գ����������ݷ���
		
		//���շ���ֵ������ֵ������룺��֪�����ԣ�gbk����/utf-8����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream(), "gbk"));	//���ʻ�
		
		//ÿ��һ�У�ѭ������
		String str = "";
		while(( str = br.readLine() ) != null ) {
			System.out.println(str);
		}
		
		//�ͷ���Դ
		socket.close();
	}
}
