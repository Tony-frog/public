package javase.base.inner;

public class Outer {
	private Integer count = 0;
	
	class Inner{
		public void size() {
			count++;
			System.out.println(count);
		}
	}
	
	public void fn() {
		new Inner().size();
	}
	
	public static void main(String[] args) {
		new Outer().fn();
	}
}
