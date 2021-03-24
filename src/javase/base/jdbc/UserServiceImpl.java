package javase.base.jdbc;

import java.util.List;

public class UserServiceImpl implements UserService{
	//在这个类之外，不暴露方法，这种方式优于继承，首选，这种方法称为组合
	private SqlSession sqlSession = new SqlSessionImpl();		
	
	@Override
	public User get(Integer id) {
		return sqlSession.selectOne("");
	}

	@Override
	public List<User> queryList() {
		return sqlSession.selectList("");
	}

	@Override
	public void add(User user) {
		sqlSession.insert("");
	}

	@Override
	public void update(User user) {
		sqlSession.update("");
	}

	@Override
	public void delete(Integer id) {
		sqlSession.delete("");
	}

}
