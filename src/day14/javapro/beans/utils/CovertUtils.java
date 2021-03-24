package day14.javapro.beans.utils;

import java.util.List;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：下午2:35:25
* @description 描述：转换工具类
*/
public class CovertUtils {
	//转换文件路径到className
	//把原有集合的每个元素变成className形式
	public static List<String> getClassName(String baseDir, List<String> fileList){
		for(int i=0; i< fileList.size(); i++) {
			String filename = fileList.get(i);
			
			filename = filename.replace("\\", "/");
			baseDir = baseDir.replace("\\", "/");
			
			//替换基准路径
			//把开头替换掉
			filename = filename.replace(baseDir, "");
			int pos = filename.lastIndexOf(".");
			//把.class去掉
			filename = filename.substring(0, pos);
			//把路径中/替换包路径分隔符.
			filename = filename.replace("/", ".");
			
			//把转换后classname放置回对应位置，位置内容就覆盖
			fileList.set(i, filename);
		}
		return fileList;	//公用了一个fileList
	}
}




