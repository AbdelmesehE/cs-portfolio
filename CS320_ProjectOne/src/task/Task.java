package task;

public class Task {

    // Fields
    private final String taskId;
    private String name;
    private String description;

    // Constructor
    public Task(String taskId, String name, String description) {

        // Validate taskId
        if (taskId == null || taskId.length() > 10) {
            throw new IllegalArgumentException("Invalid task ID");
        }

        // Validate name
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid task name");
        }

        // Validate description
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid task description");
        }

        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setters (only for name + description)
    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid task name");
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.description = description;
    }
}
