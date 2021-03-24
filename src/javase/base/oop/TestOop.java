package javase.base.oop;

public class TestOop {
	public static void main(String[] args) {
		
		//创建对象
		Person p1 = new Person();
		p1.setId(7);
		System.out.println(p1.getId());
		System.out.println(p1);
		
		Person p2 = new Person(7);
		System.out.println(p2.getId());
		System.out.println(p2);
		
		Person p3 = new Person(7, "詹姆士邦德");
		System.out.println(p3.getId());
		System.out.println(p3.getName());
		System.out.println(p3);
	}
}
