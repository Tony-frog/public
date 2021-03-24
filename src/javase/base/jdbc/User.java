package javase.base.jdbc;

//传递数据库 POJO类，
//要求：1. 私有属性， 2. 读getXxx写setXxx
public class User {
	//4个私有属性：编号、姓名、年龄、公司
	private Integer id;
	private String name;
	private Integer age;
	private String company;
	
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", company=" + company + "]";
	}
}
