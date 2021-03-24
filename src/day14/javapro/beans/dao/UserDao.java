package day14.javapro.beans.dao;

import java.util.ArrayList;
import java.util.List;

import day14.javapro.beans.pojo.User;


/**
* @author 作者：tony chan
* @email 邮箱：chenzs@tedu.cn
* @version v.1.0 创建时间：上午11:37:53
* @description 描述：模拟mybatis提供数据，最终从数据库获取
*/
public class UserDao {
	//获取一条
	public User selectOne(Integer id) {
		User user = new User();
		user.setId(id);
		user.setName("张居正");
		user.setCompany("明朝");
		
		return user;
	}
	
	//获取多条
	public List<User> selectList(){
		List<User> userList = new ArrayList<User>();
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("严嵩");
		u1.setCompany("明朝");
		userList.add(u1);
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("徐阶");
		u2.setCompany("明朝");
		userList.add(u2);
		
		return userList;
	}
}
