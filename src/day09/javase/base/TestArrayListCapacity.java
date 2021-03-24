package day09.javase.base;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TestArrayListCapacity {
	public static void main(String[] args) throws Exception {
		// 1.创建数组
		List<String> aList = new ArrayList<String>();

		// 2.放200个数据，看它会扩容几次
		int dataCount = 2000;
		int count = 0;				//记录扩容次数
		int oldCapacity = 0;		//中间变量记录扩容大小，用于判断条件
		for (int i = 0; i < dataCount; i++) {
			int capacity = TestArrayListCapacity.getCapacity(aList);
			// 在记录一个旧的数字和新的数字不同，代表一次扩容
			if(oldCapacity != capacity) {		//扩容
				System.out.println("扩容啦");
				// 扩容后，把新的值赋值旧的值
				oldCapacity = capacity;
				count++;
			}

			aList.add(i + "");
			System.out.println(i + "，数组的长度：" + capacity);
		}
		System.out.println("扩容次数："+count);

		System.out.println("");
	}

	// 返回当前数组中成员变量elementData[]数组长度
	public static int getCapacity(List<String> aList) throws Exception {
		// 反射，api，获取成员变量，设置可见性（报错）必须设置
		// 获取变量，获取数组长度

		// 1.反射同类分析，必须先获取当前对象的类
		Class<?> clazz = aList.getClass();
		// 2.获取成员变量，也成为属性 Field
		// 访问固定属性 elementData
		Field f = clazz.getDeclaredField("elementData");
		// 3.必须设置访问权限，它对外不公开，设置公开
		f.setAccessible(true); // 改变权限，设置可以访问

		// 返回对象，强制转换数组，跟着业务走
		Object[] o = (Object[]) f.get(aList); // 从当前对象中获取这个属性

		return o.length;
	}
}
