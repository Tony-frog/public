package day14.javapro.beans.controller;

import java.util.List;

import day14.javapro.beans.annotation.Controller;
import day14.javapro.beans.pojo.User;
import day14.javapro.beans.service.UserService;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：上午11:47:00
* @description 描述：
*/

@Controller
public class UserController {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public User get(Integer id) {
		User user = userService.get(id);
		return user;
	}
	
	public List<User> queryAll(){
		List<User> userList = userService.queryAll();
		return userList;
	}
}
