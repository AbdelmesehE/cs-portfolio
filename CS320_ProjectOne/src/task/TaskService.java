package task;

import java.util.HashMap;
import java.util.Map;

public class TaskService {

    private final Map<String, Task> tasks = new HashMap<>();

    // Add task with unique ID
    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }

        String id = task.getTaskId();

        if (tasks.containsKey(id)) {
            throw new IllegalArgumentException("Task ID already exists");
        }

        tasks.put(id, task);
    }

    // Delete task by ID
    public void deleteTask(String taskId) {
        if (taskId == null) {
            throw new IllegalArgumentException("Task ID cannot be null");
        }

        if (!tasks.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID does not exist");
        }

        tasks.remove(taskId);
    }

    // Update name by ID
    public void updateTaskName(String taskId, String name) {
        if (taskId == null) {
            throw new IllegalArgumentException("Task ID cannot be null");
        }

        Task task = tasks.get(taskId);
        if (task == null) {
            throw new IllegalArgumentException("Task ID does not exist");
        }

        task.setName(name);
    }

    // Update description by ID
    public void updateTaskDescription(String taskId, String description) {
        if (taskId == null) {
            throw new IllegalArgumentException("Task ID cannot be null");
        }

        Task task = tasks.get(taskId);
        if (task == null) {
            throw new IllegalArgumentException("Task ID does not exist");
        }

        task.setDescription(description);
    }

    // Helper method (useful for testing)
    public Task getTask(String taskId) {
        return tasks.get(taskId);
    }
}
