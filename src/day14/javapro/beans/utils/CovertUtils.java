package day14.javapro.beans.utils;

import java.util.List;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����2:35:25
* @description ������ת��������
*/
public class CovertUtils {
	//ת���ļ�·����className
	//��ԭ�м��ϵ�ÿ��Ԫ�ر��className��ʽ
	public static List<String> getClassName(String baseDir, List<String> fileList){
		for(int i=0; i< fileList.size(); i++) {
			String filename = fileList.get(i);
			
			filename = filename.replace("\\", "/");
			baseDir = baseDir.replace("\\", "/");
			
			//�滻��׼·��
			//�ѿ�ͷ�滻��
			filename = filename.replace(baseDir, "");
			int pos = filename.lastIndexOf(".");
			//��.classȥ��
			filename = filename.substring(0, pos);
			//��·����/�滻��·���ָ���.
			filename = filename.replace("/", ".");
			
			//��ת����classname���ûض�Ӧλ�ã�λ�����ݾ͸���
			fileList.set(i, filename);
		}
		return fileList;	//������һ��fileList
	}
}




