package javase.base;

public class Person {
	Integer id;
	String name;	
	
	public void kill() {	
		System.out.println("这个杀手有点冷");
	}
	
	public void work() {
		System.out.println("努力工作，超越美国");
	}
	
	public void work(String who) {
		System.out.println(who + "努力工作，超越美国");
	}

	public static void main(String[] args) {
		//创建第一个对象
		Person p1 = new Person();
		p1.id = 007;
		p1.name="James Bond";
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		
		p1.kill();
		
		System.out.println("===============");
		
		//创建第二个对象
		Person p2 = new Person();
		p2.id = 001;
		p2.name="任正非";
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		
		p2.work();
		p2.work(p2.name);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
