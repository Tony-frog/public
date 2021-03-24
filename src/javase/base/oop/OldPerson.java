package javase.base.oop;

//在复杂变量中，它的里面的变量要用包装类型
public class OldPerson {
	//考虑人员有哪些特征
	//编号
	//修饰符，修饰范围，public共用，private私有
	private Integer id = 100;		//成员变量，也称为field 属性

	//方法公用，返回和成员变量相同类型
	public Integer getId() {		//java名称驼峰规则
		System.out.println("id被人访问了："+id);
		return id;
	}
	//方法公用，返回值void，驼峰规则，(参数)
	public void setId(Integer id) {	//参数id不是成员变量
		//参数叫id，成员变量也叫id，id=id
		//变量名称相同，为了区分变量名称访问是谁，java提出this关键字
		//this代表，代表类
		
		if(id==1) {
			System.out.println("给他多发钱");
		}
		this.id = id;	//前面是成员变量，后面是参数
	}
	
	//姓名，能获取这个值，但是我不让你改变！
	private String name = "tony";
	public String getName() {
		return name;
	}

	//性别
	private Boolean sex;		//男true，女false
	
	//年龄
	public Integer age;
	
	//所在公司
	public String company;


	
	//创建getter（获取）和setter（设置）方法
	//IDE eclipse 自动生成getter和setter方法
	
}





