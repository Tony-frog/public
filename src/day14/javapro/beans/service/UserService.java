package day14.javapro.beans.service;

import java.util.List;

import day14.javapro.beans.annotation.Service;
import day14.javapro.beans.dao.UserDao;
import day14.javapro.beans.pojo.User;

/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：上午11:43:35
* @description 描述：从dao层获取数据
*/

@Service
public class UserService {
	private UserDao userDao;
	
	//set注入
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User get(Integer id) {
		User user = userDao.selectOne(id);
		return user;
	}
	
	public List<User> queryAll(){
		List<User> userList = userDao.selectList();
		return userList;
	}
}
