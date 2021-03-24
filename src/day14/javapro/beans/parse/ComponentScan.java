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
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����3:16:59
* @description ��������ɨ�裬ֻ��Controller��Service
*/
public class ComponentScan {
	//ȫ�ֹ�������
	private static final Map<String, Object> beans
		= new HashMap<String, Object>(); 
	
	//ɨ��Ŀ¼
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
	
	//���ã��������󣬷���������
	public void create(List<String> filenameList, String baseDir) throws Exception {
		List<String> classnameList
			= CovertUtils.getClassName(baseDir, filenameList);
		
		//�������ϣ���������
		for(String classname : classnameList) {
			//���䴴������
			Class<?> clazz = Class.forName(classname);

			//����ע�����ж��Ƿ񴴽�����
			Controller ca = clazz.getAnnotation(Controller.class);
			Service sa = clazz.getAnnotation(Service.class);
			
			if(ca != null || sa != null) {
				//��������
				Object obj = clazz.newInstance();
				//�������������
				beans.put(classname, obj);
			}
			
			System.out.println(classname);
		}
		
		System.out.println("\n���������������󣬷�������");
		for(String key : beans.keySet()) {		//����key���ϣ����л�ȡԪ��
			System.out.println( beans.get(key) );
		}
	}
	
}
