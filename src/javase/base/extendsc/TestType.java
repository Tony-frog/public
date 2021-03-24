package javase.base.extendsc;

//打印八种包装类型的父类
public class TestType {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//布尔类型
		Boolean b = new Boolean(true);
		System.out.println(b);
		System.out.println(b.getClass().getSuperclass());
		
		//字符类型
		Character c = new Character('a');
		System.out.println(c);	//97
		System.out.println(c.getClass().getSuperclass());
		
		//数值类型
		byte by = 0;
		Byte bt = new Byte( by );
		System.out.println( bt.getClass().getSuperclass() );
		System.out.println( bt.getClass().getSuperclass().getSuperclass() );
		
		//强制转换
		Short s = new Short( (short) 0 );
		System.out.println(s.getClass().getSuperclass());
		
		Integer i = new Integer(0);
		System.out.println(s.getClass().getSuperclass());
		
		Long l = new Long(0);
		System.out.println(s.getClass().getSuperclass());
		
		//浮点数
		Float f = new Float(0.0);
		System.out.println(f.getClass().getSuperclass());
		System.out.println(f.getClass().getSuperclass().getSuperclass());
		
		Double d = new Double(0.0);
		System.out.println(f.getClass().getSuperclass());
		System.out.println(f.getClass().getSuperclass().getSuperclass());
	}
}



