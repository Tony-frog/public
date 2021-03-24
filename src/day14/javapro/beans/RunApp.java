package day14.javapro.beans;

import java.util.List;

import day14.javapro.beans.parse.ComponentScan;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：下午3:33:03
* @description 描述：
*/
public class RunApp {
	public static void main(String[] args) throws Exception {
		String scanDir = "D:\\java\\ws\\1907\\1907-javase\\bin\\day14\\";
		String baseDir = "D:\\java\\ws\\1907\\1907-javase\\bin\\";
		ComponentScan context = new ComponentScan();
		
		System.out.println("第一步：包扫描");
		List<String> filenameList 
			= context.scan(baseDir, scanDir);
		
		System.out.println("\n第二步：转换成类名className");
		context.create(filenameList, baseDir);
	}
}
