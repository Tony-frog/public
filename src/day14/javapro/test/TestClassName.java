package day14.javapro.test;

import java.util.ArrayList;
import java.util.List;

import day14.javapro.beans.utils.CovertUtils;
import day14.javapro.beans.utils.FileUtils;

public class TestClassName {
	public static void main(String[] args) {
		//要按自己的当前的环境来写目录
		String baseDir = "D:\\java\\ws\\1907\\1907-javase\\bin\\";
		String dir = "D:\\java\\ws\\1907\\1907-javase\\bin\\day14\\javapro\\beans\\";
		List<String> fileList = new ArrayList<String>();
		
		FileUtils.getFileName(dir, fileList);
		
		fileList = CovertUtils.getClassName(baseDir, fileList);
		for(String className : fileList) {
			System.out.println(className);
		}
	}
}
