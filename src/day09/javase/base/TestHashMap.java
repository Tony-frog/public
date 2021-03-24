package day09.javase.base;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		//创建一个HashMap集合
		Map<String, Integer> map = new HashMap<String, Integer>();
		//放入元素，hash()%n算法进行散列，整个数组
		map.put("语文", 100);
		map.put("数学", 99);
		map.put("物理", 60);		//kv键值对

		//获取一个值
		Integer score = map.get("语文");
		System.out.println(score);
		
		//遍历，先取出它所有的key，根据key去获取它对应值
		//hash%n算法，乱序，维护成本低，性能高
		for(String key : map.keySet()) { 	//从map获取所有key的集合
			System.out.print("key=" + key);
			System.out.println(", value=" + map.get(key));
		}
		
		
	}
}
