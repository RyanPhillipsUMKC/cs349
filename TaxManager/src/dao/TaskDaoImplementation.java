package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Task;
import model.TaskPriority;
import model.TaskStatus;
import model.User;

public class TaskDaoImplementation implements TaskInterface {
	
	private long nextId = 1l;
	private final List<Task> tasksList = new ArrayList<Task>();
	
	
	public TaskDaoImplementation() {
		super();
		seedTasks();
	}

	private void seedTasks() {
		User user = new User();
		user.setId(1l);
		
		Task t1 = new Task(
				0l, 
				user, 
				"Drop off kids", 
				"", 
				LocalDate.now(), 
				LocalDate.now().plusDays(1),
				TaskStatus.Open,
				TaskPriority.High);
		
		Task t2 = new Task(
				1l, 
				user, 
				"Drop off kids", 
				"", 
				LocalDate.now(), 
				LocalDate.now().plusDays(1),
				TaskStatus.Open,
				TaskPriority.High);
		
		insert(t1);
		insert(t2);
	}

	@Override
	public List<Task> findAll() {
		// const copy for viewing
		/*List<Task> Filtered;
		for (Task task : tasksList) {
			if (task.getId() == 
		}*/
		return Collections.unmodifiableList(new ArrayList<Task>(tasksList));
	}

	@Override
	public long insert(Task task) {
		long assignedId = nextId++;
		task.setId(assignedId);
		tasksList.add(task);
		return assignedId;
	}

	@Override
	public void update(Task task) {

	}

	@Override
	public void delete(long id) {

	}
}
