package day12.javapro.dir;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//ɨ��Ŀ¼����ӡĿ¼��Ŀ¼�µ��ļ�
public class ScanDir {
	
	public static void main(String[] args) {
		//�����ļ�����
		List<String> fileList = new ArrayList<String>();

		String dir = "D:\\java\\ws\\1907\\1907-javase\\bin";		//��㻻
		List<String> aList = ScanDir.floder(dir, fileList);
		
		//�г��ļ�
		for(String f : aList) {
			System.out.println(f);
		}
	}
	
	//�ݹ鷽����ÿ�ε��÷���ʱ��dir���ݱ���仯
	public static List<String> floder(String dir, List<String> fileList) {
		@SuppressWarnings("rawtypes")
		Class class123 = dir.getClass();
		
		
		//Ŀ¼���ļ� java.io һ��
		//��ȡdir����Ŀ¼���γ�File����
		File file = new File(dir);		//Ŀ¼Ҳ�����ļ���ͳ��file
		
		//��ȡ��ǰĿ¼�µ��������ݣ�ֻ��һ����Ϊ�����ܣ�����һ�¶��ø���
		File[] files = file.listFiles();
		for(File f : files) {
			if(f.isDirectory()) {
				//�г���һ��Ŀ¼���ļ���
				dir = f.getAbsolutePath();		//����dir�ͱ��ı�
				//System.out.println("Ŀ¼��" + dir);
 				floder(dir, fileList);		//��������
			}else {
				fileList.add(f.getAbsolutePath());
				//System.out.println("�ļ���"+ f.getAbsolutePath());
			}
		}
		return fileList;
	}
}



