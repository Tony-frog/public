package day14.javapro.old.service;

import java.util.ArrayList;
import java.util.List;

import day14.javapro.old.pojo.User;

//ҵ���
public class UserService {
	//ģ�ⷵ��һ������
	public User get(Integer id) {
		User user = new User();
		user.setId(id);
		user.setName("�ž���");
		user.setCompany("������������");
		
		return user;
	}
	
	//ģ�ⷵ�ض�������
	public List<User> queryAll(){
		List<User> userList = new ArrayList<User>();
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("����");
		u1.setCompany("��������");
		userList.add(u1);
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("���");
		u2.setCompany("��������");
		userList.add(u2);
		
		return userList;
	}
}
