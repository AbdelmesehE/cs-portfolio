package appointment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {

    @Test
    void testAddAppointment() {
        AppointmentService service = new AppointmentService();
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        
        Appointment appt = new Appointment("A1", futureDate, "Test description");
        service.addAppointment(appt);

        assertNotNull(service.getAppointment("A1"));
    }

    @Test
    void testAddDuplicateId() {
        AppointmentService service = new AppointmentService();
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        Appointment appt1 = new Appointment("A1", futureDate, "First");
        Appointment appt2 = new Appointment("A1", futureDate, "Second"); // same ID

        service.addAppointment(appt1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(appt2);
        });
    }

    @Test
    void testDeleteAppointment() {
        AppointmentService service = new AppointmentService();
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        Appointment appt = new Appointment("A1", futureDate, "Test description");
        service.addAppointment(appt);

        // now delete
        service.deleteAppointment("A1");

        assertNull(service.getAppointment("A1"));
    }
    @Test
    void testDeleteMissingIdThrows() {
        AppointmentService service = new AppointmentService();
        assertThrows(IllegalArgumentException.class, () -> service.deleteAppointment("NOPE"));
    }
}
