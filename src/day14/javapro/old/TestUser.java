package day14.javapro.old;

import java.util.List;

import day14.javapro.old.controller.UserController;
import day14.javapro.old.pojo.User;
import day14.javapro.old.service.UserService;

public class TestUser {
	public static void main(String[] args) {
		//��ͳ��ʽ���ã�
		//1.�������ж���
		UserService userService = new UserService();
		UserController userController = new UserController();
		
		//ͨ��setע�룬��Ա����������г�ʼ��
		userController.setUserService(userService);
		
		//2.����userController��������userService�������ڲ�get����
		User user = userController.get(1);
		System.out.println(user);
		
		List<User> userList = userController.queryAll();
		System.out.println(userList);
	}
}
