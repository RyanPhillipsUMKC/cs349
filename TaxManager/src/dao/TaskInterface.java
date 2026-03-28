package dao;
import java.util.List;

import model.Task;

public interface TaskInterface {
	List<Task> findAll();
	long insert(Task task);
	void update(Task task);
	void delete(long id);
}