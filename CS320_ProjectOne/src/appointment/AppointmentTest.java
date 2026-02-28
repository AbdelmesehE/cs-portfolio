package appointment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class AppointmentTest {

    @Test
    void testCreateValidAppointment() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000); // future
        Appointment appt = new Appointment("A123", futureDate, "Valid description");
        assertEquals("A123", appt.getAppointmentId());
        assertEquals(futureDate, appt.getAppointmentDate());
        assertEquals("Valid description", appt.getDescription());
    }

    // ---- Appointment ID tests ----
    @Test
    void testAppointmentIdNull() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, futureDate, "Valid description");
        });
    }

    @Test
    void testAppointmentIdTooLong() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678901", futureDate, "Valid description"); // 11 chars
        });
    }

    // ---- Appointment Date tests ----
    @Test
    void testAppointmentDateNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", null, "Valid description");
        });
    }

    @Test
    void testAppointmentDateInPast() {
        Date pastDate = new Date(System.currentTimeMillis() - 100000); // past
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", pastDate, "Valid description");
        });
    }

    // ---- Description tests ----
    @Test
    void testDescriptionNull() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", futureDate, null);
        });
    }

    @Test
    void testDescriptionTooLong() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        String longDescription = "123456789012345678901234567890123456789012345678901"; // 51 chars
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("A123", futureDate, longDescription);
        });
    }
}
