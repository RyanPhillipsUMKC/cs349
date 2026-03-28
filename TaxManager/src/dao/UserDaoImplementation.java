package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.User;


public class UserDaoImplementation implements UserDaoInterface {
	
	private long nextId = 1l;
	private final List<User> users = new ArrayList<User>();

	@Override
	public long addUser(User user) {
		long id = nextId++;
		user.setId(id);
		users.add(user);
		return id;
	}

	@Override
	public Optional<User> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<User> findByUsername(String name) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void removeUser(long id) {
		// TODO Auto-generated method stub

	}

}
