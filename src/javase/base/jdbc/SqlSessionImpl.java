package javase.base.jdbc;

import java.util.List;

public class SqlSessionImpl implements SqlSession{
	public User selectOne(String sql) {
		User user = new User();
		user.setId(7);
		user.setName("詹姆士邦德");
		user.setAge(50);
		user.setCompany("军情6处");
		
		return user;
	}

	public List<User> selectList(String sql) {
		return null;
	}

	public int insert(String sql) {
		return 0;
	}

	public int update(String sql) {
		return 0;
	}

	public int delete(String sql) {
		return 0;
	}

}
