package javase.base.oop;

public class Person {
	//成员变量
	private Integer id;
	private String name;
	String company;
	
	
	//构造方法，无参构造
	public Person() {
		System.out.println("我是默认构造方法");
	}
	
	//构造方法，有参构造
	public Person(Integer id) {
		this.id = id;		//初始化
		System.out.println("带参构造，进行初始化");
	}
	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("带参构造，进行初始化");
	}
	
	//方法
	public void kill() {
		int x = 90;	//局部变量
		
		System.out.println("我是杀手");
	}
	
	public void work(Integer id, String name) {	//name参数变量
		this.id = id;
		this.name = name;
		System.out.println("work方法执行");
	}
	
	
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
	
	//把对象的内容变成一个字符串输出，类似Arrays.toString()
	
}
