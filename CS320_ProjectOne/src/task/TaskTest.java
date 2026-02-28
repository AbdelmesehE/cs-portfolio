package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskTest {

    // ---------- Positive test (valid Task) ----------
    @Test
    void testTaskCreatedSuccessfully() {
        Task task = new Task("12345", "Task Name", "Task description");

        assertEquals("12345", task.getTaskId());
        assertEquals("Task Name", task.getName());
        assertEquals("Task description", task.getDescription());
    }

    // ---------- taskId validation ----------
    @Test
    void testTaskIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Task Name", "Task description");
        });
    }

    @Test
    void testTaskIdCannotBeLongerThan10() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345678901", "Task Name", "Task description"); // 11 chars
        });
    }

    // Task ID is not updatable: this is verified by design (no setter)
    @Test
    void testTaskIdIsNotUpdatable() {
        Task task = new Task("12345", "Task Name", "Task description");

        // If this compiles, it would mean there IS a setter.
        // We confirm immutability by checking the ID stays the same after other updates.
        task.setName("New Name");
        task.setDescription("New description");

        assertEquals("12345", task.getTaskId());
    }

    // ---------- name validation ----------
    @Test
    void testNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", null, "Task description");
        });
    }

    @Test
    void testNameCannotBeLongerThan20() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "123456789012345678901", "Task description"); // 21 chars
        });
    }

    @Test
    void testSetNameCannotBeNull() {
        Task task = new Task("12345", "Task Name", "Task description");

        assertThrows(IllegalArgumentException.class, () -> {
            task.setName(null);
        });
    }

    @Test
    void testSetNameCannotBeLongerThan20() {
        Task task = new Task("12345", "Task Name", "Task description");

        assertThrows(IllegalArgumentException.class, () -> {
            task.setName("123456789012345678901"); // 21 chars
        });
    }

    // ---------- description validation ----------
    @Test
    void testDescriptionCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task Name", null);
        });
    }

    @Test
    void testDescriptionCannotBeLongerThan50() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task Name",
                    "123456789012345678901234567890123456789012345678901"); // 51 chars
        });
    }

    @Test
    void testSetDescriptionCannotBeNull() {
        Task task = new Task("12345", "Task Name", "Task description");

        assertThrows(IllegalArgumentException.class, () -> {
            task.setDescription(null);
        });
    }

    @Test
    void testSetDescriptionCannotBeLongerThan50() {
        Task task = new Task("12345", "Task Name", "Task description");

        assertThrows(IllegalArgumentException.class, () -> {
            task.setDescription("123456789012345678901234567890123456789012345678901"); // 51 chars
        });
    }

    // ---------- update behavior tests ----------
    @Test
    void testSetNameUpdatesName() {
        Task task = new Task("12345", "Task Name", "Task description");
        task.setName("Updated Name");
        assertEquals("Updated Name", task.getName());
    }

    @Test
    void testSetDescriptionUpdatesDescription() {
        Task task = new Task("12345", "Task Name", "Task description");
        task.setDescription("Updated description");
        assertEquals("Updated description", task.getDescription());
    }
}
