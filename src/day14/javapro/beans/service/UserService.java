package day14.javapro.beans.service;

import java.util.List;

import day14.javapro.beans.annotation.Service;
import day14.javapro.beans.dao.UserDao;
import day14.javapro.beans.pojo.User;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����11:43:35
* @description ��������dao���ȡ����
*/

@Service
public class UserService {
	private UserDao userDao;
	
	//setע��
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
