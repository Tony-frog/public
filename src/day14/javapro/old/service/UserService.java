package day14.javapro.old.service;

import java.util.ArrayList;
import java.util.List;

import day14.javapro.old.pojo.User;

//业务层
public class UserService {
	//模拟返回一条数据
	public User get(Integer id) {
		User user = new User();
		user.setId(id);
		user.setName("张居正");
		user.setCompany("明朝万历中兴");
		
		return user;
	}
	
	//模拟返回多条数据
	public List<User> queryAll(){
		List<User> userList = new ArrayList<User>();
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("严嵩");
		u1.setCompany("明朝万历");
		userList.add(u1);
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("徐阶");
		u2.setCompany("明朝万历");
		userList.add(u2);
		
		return userList;
	}
}
