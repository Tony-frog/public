package day14.javapro.old.controller;

import java.util.List;

import day14.javapro.old.pojo.User;
import day14.javapro.old.service.UserService;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：上午10:27:24
* @description 描述：
*/

//控制层（表现层）
public class UserController {
	//调用
	private UserService userService;

	//set注入，调用set方法设置，只需要set方法
	//对象变量，初始化
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//获取单个对象
	public User get(Integer id) {
		User user = userService.get(id);
		return user;
	}
	
	//获取集合对象
	public List<User> queryAll(){
		List<User> userList = userService.queryAll();
		return userList;
	}
}
