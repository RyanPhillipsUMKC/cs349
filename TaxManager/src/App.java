/*
 * Ryan Phillips
 */
import java.time.LocalDate;

import dao.TaskDaoImplementation;
import dao.UserDaoImplementation;
import model.Task;
import model.TaskPriority;
import model.TaskStatus;
import model.User;
import service.TaskService;
import service.UserService;

public class App {
	public static void main(String[] args) {
		// Allocate user service and register myself as user
		UserService userService = new UserService(new UserDaoImplementation());
		User user = userService.registerUser("Ryan Phillips");
		System.out.println(user.getFullName());
		
		// Allocate task service 
		TaskService taskService = new TaskService(new TaskDaoImplementation());
		Task newTask = new Task(
				0l, 
				user, 
				"Drop off kids", 
				"", 
				LocalDate.now(), 
				LocalDate.now().plusDays(1),
				TaskStatus.Open,
				TaskPriority.High);
		taskService.createTask(newTask);
		System.out.println(taskService.getAllTasks());
		
		// prompt: show the real info of the tasks
		System.out.println("Printing task values");
		for (Task task : taskService.getAllTasks()) {
			if (task != null) {
				System.out.println(
						"Id: " + task.getId() + " " +
						"User memeory address: " + task.getUser() + " " +
						"Title: " + task.getTitle() + " " +
						"Description: " + task.getDescription() + " " +
						"Created at: " + task.getCreatedAt() + " " +
						"Due date: " + task.getDueDate() + " " +
						"Status: " + task.getStatus() + " " +
						"Priority: " + task.getPriority() + " ");
			}
		}
	}
}