package day12.javapro.dir;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//扫描目录，打印目录和目录下的文件
public class ScanDir {
	
	public static void main(String[] args) {
		//保存文件集合
		List<String> fileList = new ArrayList<String>();

		String dir = "D:\\java\\ws\\1907\\1907-javase\\bin";		//随便换
		List<String> aList = ScanDir.floder(dir, fileList);
		
		//列出文件
		for(String f : aList) {
			System.out.println(f);
		}
	}
	
	//递归方法，每次调用方法时，dir内容必须变化
	public static List<String> floder(String dir, List<String> fileList) {
		@SuppressWarnings("rawtypes")
		Class class123 = dir.getClass();
		
		
		//目录和文件 java.io 一体
		//获取dir所在目录，形成File对象
		File file = new File(dir);		//目录也当成文件，统称file
		
		//获取当前目录下的所有内容，只是一级，为了性能，不会一下都拿给你
		File[] files = file.listFiles();
		for(File f : files) {
			if(f.isDirectory()) {
				//列出下一级目录和文件、
				dir = f.getAbsolutePath();		//参数dir就被改变
				//System.out.println("目录：" + dir);
 				floder(dir, fileList);		//调用自身
			}else {
				fileList.add(f.getAbsolutePath());
				//System.out.println("文件："+ f.getAbsolutePath());
			}
		}
		return fileList;
	}
}



