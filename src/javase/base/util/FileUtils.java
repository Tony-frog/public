package javase.base.util;

//项目工具类
public class FileUtils {
	
	//根据文件所在目录，转成类全名
//D:\java\ws\1907\1907-javase\bin\javase\base\HelloWorld.class
//D:\java\ws\1907\1907-javase\bin\
	public static String getClassFullName(
				String filename, String baseDir
			) {
		//1.对文件名先去掉基准路径
		int pos = baseDir.length();	//截取开始位置
		String s = filename.substring(pos);
		
		//2.替换内容，正则表达式
		//\转义\斜杠\转义\斜杠
		s = s.replaceAll("\\\\", ".");
		
		//3.去掉.class后缀
		//a.替换，.class 替换 ""
		//b.substring，倒数6
		//c.substring lastIndexOf(".")	条条大路通罗马，程序不同人写不同的实现
		
		//javase.base.HelloWorld.class
		
		s = s.substring(0, s.lastIndexOf("."));
		
		return s;
	}
	
	//抽取成一个工具类：传入一个全限定名，返回实例名称
		public static String getInstanceName(String classFullName) {
			//String classFullName = "javase.base.HelloWorld";
			//分割字符串，获取得到数组最后元素
			//正则表达式，.代表每个字符，必须转义\
			String[] arr = classFullName.split("\\.");
			String className = arr[ arr.length -1  ];	//数组的最后一个元素
			
			//实例名称？首字母小写。1)获取全小写，2）charAt(0) ，3）截串
			String instanceName =  className.toLowerCase().charAt(0)
					+ className.substring(1);

			return instanceName;
		}
	
}
