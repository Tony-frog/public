package javase.base.jdbc;

import java.util.List;

public interface SqlSession {
	public User selectOne(String sql);
	public List<User> selectList(String sql);
	public int insert(String sql);
	public int update(String sql);
	public int delete(String sql);
}
