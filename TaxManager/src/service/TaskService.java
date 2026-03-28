package service;

import java.util.List;

import dao.TaskDaoImplementation;
import model.Task;

public class TaskService {
	private final TaskDaoImplementation taskDao;
	
	public TaskService(TaskDaoImplementation taskDao) {
		this.taskDao = taskDao;
	}
	
	public List<Task> getAllTasks() {
		return taskDao.findAll();
	}
	
	public long createTask(Task task) {
		return taskDao.insert(task);
	}
	
}
