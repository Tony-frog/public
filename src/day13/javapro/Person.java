package day13.javapro;
/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺2019��8��16�� ����11:22:44
* @description ���������ֻ��˽�����Ժ�get/set�����������POJO��javaBean
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
