package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest{

    private TaskService service;

    @BeforeEach
    void setUp() {
        service = new TaskService();
    }

    // ---------- Add tests ----------
    @Test
    void testAddTaskSuccessfully() {
        Task task = new Task("1", "Name", "Description");
        service.addTask(task);

        assertNotNull(service.getTask("1"));
        assertEquals("Name", service.getTask("1").getName());
        assertEquals("Description", service.getTask("1").getDescription());
    }

    @Test
    void testAddTaskRejectsDuplicateId() {
        Task task1 = new Task("1", "Name1", "Description1");
        Task task2 = new Task("1", "Name2", "Description2");

        service.addTask(task1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addTask(task2);
        });
    }

    @Test
    void testAddTaskRejectsNullTask() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.addTask(null);
        });
    }

    // ---------- Delete tests ----------
    @Test
    void testDeleteTaskSuccessfully() {
        Task task = new Task("1", "Name", "Description");
        service.addTask(task);

        service.deleteTask("1");

        assertNull(service.getTask("1"));
    }

    @Test
    void testDeleteTaskRejectsMissingId() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteTask("999");
        });
    }

    @Test
    void testDeleteTaskRejectsNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteTask(null);
        });
    }

    // ---------- Update tests ----------
    @Test
    void testUpdateTaskNameSuccessfully() {
        Task task = new Task("1", "Name", "Description");
        service.addTask(task);

        service.updateTaskName("1", "Updated Name");

        assertEquals("Updated Name", service.getTask("1").getName());
    }

    @Test
    void testUpdateTaskDescriptionSuccessfully() {
        Task task = new Task("1", "Name", "Description");
        service.addTask(task);

        service.updateTaskDescription("1", "Updated Description");

        assertEquals("Updated Description", service.getTask("1").getDescription());
    }

    @Test
    void testUpdateNameRejectsMissingId() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskName("999", "New Name");
        });
    }

    @Test
    void testUpdateDescriptionRejectsMissingId() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskDescription("999", "New Description");
        });
    }

    @Test
    void testUpdateNameRejectsNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskName(null, "New Name");
        });
    }

    @Test
    void testUpdateDescriptionRejectsNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskDescription(null, "New Description");
        });
    }

    // These also indirectly test Task validation through setters
    @Test
    void testUpdateNameRejectsInvalidName() {
        Task task = new Task("1", "Name", "Description");
        service.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskName("1", null);
        });
    }

    @Test
    void testUpdateDescriptionRejectsInvalidDescription() {
        Task task = new Task("1", "Name", "Description");
        service.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskDescription("1", null);
        });
    }
}
