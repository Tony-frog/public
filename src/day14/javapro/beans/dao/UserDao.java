package day14.javapro.beans.dao;

import java.util.ArrayList;
import java.util.List;

import day14.javapro.beans.pojo.User;


/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����11:37:53
* @description ������ģ��mybatis�ṩ���ݣ����մ����ݿ��ȡ
*/
public class UserDao {
	//��ȡһ��
	public User selectOne(Integer id) {
		User user = new User();
		user.setId(id);
		user.setName("�ž���");
		user.setCompany("����");
		
		return user;
	}
	
	//��ȡ����
	public List<User> selectList(){
		List<User> userList = new ArrayList<User>();
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("����");
		u1.setCompany("����");
		userList.add(u1);
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("���");
		u2.setCompany("����");
		userList.add(u2);
		
		return userList;
	}
}
