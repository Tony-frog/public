package day14.javapro.old.controller;

import java.util.List;

import day14.javapro.old.pojo.User;
import day14.javapro.old.service.UserService;

/**
* @author ���ߣ�tony chan
* @email ���䣺chenzs@tedu.cn
* @version v.1.0 ����ʱ�䣺����10:27:24
* @description ������
*/

//���Ʋ㣨���ֲ㣩
public class UserController {
	//����
	private UserService userService;

	//setע�룬����set�������ã�ֻ��Ҫset����
	//�����������ʼ��
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//��ȡ��������
	public User get(Integer id) {
		User user = userService.get(id);
		return user;
	}
	
	//��ȡ���϶���
	public List<User> queryAll(){
		List<User> userList = userService.queryAll();
		return userList;
	}
}
