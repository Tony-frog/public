package day14.javapro.test;

import java.util.ArrayList;
import java.util.List;

import day14.javapro.beans.utils.FileUtils;

public class TestFileUtils {
	public static void main(String[] args) {
		List<String> fileList = new ArrayList<String>();
		String dir = "D:\\java\\ws\\1907\\1907-javase\\bin\\day14\\javapro\\beans";
		FileUtils.getFileName(dir, fileList);
		
		for(String filename : fileList) {
			System.out.println(filename);
		}
	}
}
