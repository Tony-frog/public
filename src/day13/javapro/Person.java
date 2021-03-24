package day13.javapro;
/**
* @author 作者：tony chan
* @version 创建时间：2019年8月16日 上午11:22:44
* @description 描述：如果只有私有属性和get/set方法，这个类POJO，javaBean
*/
public class Person {
	private Integer id = 1;
	private String name = "tony";
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
