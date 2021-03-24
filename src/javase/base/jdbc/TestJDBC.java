package javase.base.jdbc;

public class TestJDBC {
	public static void main(String[] args) {
		//类是有接口，先接口，new实现类
		//查询一个方法，创建对象
		UserService userService = new UserServiceImpl();
		
		User user = userService.get(7);
		System.out.println(user);
		
	}
}
