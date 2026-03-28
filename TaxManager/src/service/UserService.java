package service;

import dao.UserDaoImplementation;
import model.User;

public class UserService {
	private final UserDaoImplementation userDao;

	public UserService(UserDaoImplementation userDao) {
		super();
		this.userDao = userDao;
	}
	
	public User registerUser(String fullName)
	{
		User user = new User();
		user.setFullName(fullName);
		long id = userDao.addUser(user);
		user.setId(id);
		return user;
	}
}
