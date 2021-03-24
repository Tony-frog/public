package day18.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����11:50:31
* @description ������
*/
public class PropertiesUtils {
	public static void main(String[] args) throws Exception {
		//��ȡ�ļ���Ŀ¼
		String dir = PropertiesUtils.class.getResource("/day18/prop/").getPath();
		System.out.println(dir);
		
		//�ļ�������
		InputStream is = 
				new FileInputStream(dir+"jdbc.properties");
		System.out.println(is);
		
		//���Զ��󣬼������������ļ�
		Properties prop = new Properties();
		prop.load(is);	//���ص��ڴ��У�����ļ�С�ļ�
		
		//��ȡ��һ������
		String driver = prop.getProperty("jdbc.driver");
		System.out.println("jdbc.driver="+driver);
		
		String password = prop.getProperty("jdbc.password");
		System.out.println("jdbc.password="+password);
	}
}



