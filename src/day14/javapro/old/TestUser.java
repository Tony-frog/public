package day14.javapro.old;

import java.util.List;

import day14.javapro.old.controller.UserController;
import day14.javapro.old.pojo.User;
import day14.javapro.old.service.UserService;

public class TestUser {
	public static void main(String[] args) {
		//传统方式调用：
		//1.创建所有对象
		UserService userService = new UserService();
		UserController userController = new UserController();
		
		//通过set注入，成员变量对象进行初始化
		userController.setUserService(userService);
		
		//2.调用userController，它调用userService，调用内部get方法
		User user = userController.get(1);
		System.out.println(user);
		
		List<User> userList = userController.queryAll();
		System.out.println(userList);
	}
}
