package javase.base.ploy.person;

public class TestPerson {
	public static void main(String[] args) {
		//名称：向上转型（自动）
		//编译阶段向左看，运行阶段向右看
		Person s = new Student();	//系统结构有扩展性
		s.eat();
		
		Person p = new Teacher();
		p.eat();
		
		//能否调用子类的个性方法，或者扩展的方法
		//p.teach();	编译阶段向左看，p就代表Person，Person没有teach()所以报错
		
		//如果想调用子类个性方法：向下转型（强制）
		Teacher t = (Teacher)p;	//强制转换
		t.eat();
		t.teach();
		
		Student s1 = (Student)s;
		s1.eat();
		s1.study();
	}
}


