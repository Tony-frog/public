package day14.javapro.beans.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day14.javapro.beans.annotation.Controller;
import day14.javapro.beans.annotation.Service;
import day14.javapro.beans.utils.CovertUtils;
import day14.javapro.beans.utils.FileUtils;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：下午3:16:59
* @description 描述：包扫描，只对Controller和Service
*/
public class ComponentScan {
	//全局共享，容器
	private static final Map<String, Object> beans
		= new HashMap<String, Object>(); 
	
	//扫描目录
	public List<String> scan(String baseDir, String dir) {
		//String baseDir = "D:\\java\\ws\\1907\\1907-javase\\bin\\";
		//String dir = "D:\\java\\ws\\1907\\1907-javase\\bin\\day14\\javapro\\beans\\";
		List<String> fileList = new ArrayList<String>();
		
		FileUtils.getFileName(dir, fileList);
		
		for(String filename : fileList) {
			System.out.println(filename);
		}
		return fileList;
	}
	
	//配置：创建对象，放入容器中
	public void create(List<String> filenameList, String baseDir) throws Exception {
		List<String> classnameList
			= CovertUtils.getClassName(baseDir, filenameList);
		
		//变量集合，创建对象
		for(String classname : classnameList) {
			//反射创建对象
			Class<?> clazz = Class.forName(classname);

			//根据注解来判断是否创建对象
			Controller ca = clazz.getAnnotation(Controller.class);
			Service sa = clazz.getAnnotation(Service.class);
			
			if(ca != null || sa != null) {
				//创建对象
				Object obj = clazz.newInstance();
				//放入对象到容器中
				beans.put(classname, obj);
			}
			
			System.out.println(classname);
		}
		
		System.out.println("\n第三步：创建对象，放入容器");
		for(String key : beans.keySet()) {		//变量key集合，从中获取元素
			System.out.println( beans.get(key) );
		}
	}
	
}
