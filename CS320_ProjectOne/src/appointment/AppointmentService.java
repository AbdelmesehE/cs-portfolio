package appointment;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {

    private final Map<String, Appointment> appointments = new HashMap<>();

    // Add appointment (ID must be unique)
    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null");
        }

        String id = appointment.getAppointmentId();

        if (appointments.containsKey(id)) {
            throw new IllegalArgumentException("Appointment ID already exists");
        }

        appointments.put(id, appointment);
    }

    // Delete appointment by ID
    public void deleteAppointment(String appointmentId) {
        if (appointmentId == null) {
            throw new IllegalArgumentException("Appointment ID cannot be null");
        }
        if (!appointments.containsKey(appointmentId)) {
            throw new IllegalArgumentException("Appointment ID does not exist");
        }
        appointments.remove(appointmentId);
    }

    // Helper for testing (lets tests confirm add/delete worked)
    public Appointment getAppointment(String appointmentId) {
        return appointments.get(appointmentId);
    }
}
