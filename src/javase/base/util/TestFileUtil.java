package javase.base.util;

public class TestFileUtil {
	public static void main(String[] args) {
		//调用静态方法
		String filename = "D:\\java\\ws\\1907\\1907-javase\\bin\\javase\\base\\HelloWorld.class";
		String baseDir = "D:\\java\\ws\\1907\\1907-javase\\bin\\";
		String classFullName = FileUtils.getClassFullName(filename, baseDir);
		System.out.println(classFullName);
		
		String instanceName = FileUtils.getInstanceName(classFullName);
		System.out.println(instanceName);
	}

}
