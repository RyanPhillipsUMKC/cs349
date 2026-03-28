package dao;
import java.util.Optional;

import model.User;

public interface UserDaoInterface {
	public long addUser(User user);
	public Optional<User> findById(long id);
	public Optional<User> findByUsername(String name);
	public void removeUser(long id);
}