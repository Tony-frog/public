package day18.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：上午11:50:31
* @description 描述：
*/
public class PropertiesUtils {
	public static void main(String[] args) throws Exception {
		//获取文件的目录
		String dir = PropertiesUtils.class.getResource("/day18/prop/").getPath();
		System.out.println(dir);
		
		//文件输入流
		InputStream is = 
				new FileInputStream(dir+"jdbc.properties");
		System.out.println(is);
		
		//属性对象，加载整个属性文件
		Properties prop = new Properties();
		prop.load(is);	//加载到内存中，这个文件小文件
		
		//读取其一个属性
		String driver = prop.getProperty("jdbc.driver");
		System.out.println("jdbc.driver="+driver);
		
		String password = prop.getProperty("jdbc.password");
		System.out.println("jdbc.password="+password);
	}
}



