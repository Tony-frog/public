package javase.base.jdbc;

import java.util.List;

public interface UserService {
	public User get(Integer id);
	public List<User> queryList();
	public void add(User user);
	public void update(User user);
	public void delete(Integer id);
}
