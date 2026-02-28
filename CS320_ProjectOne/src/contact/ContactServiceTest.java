package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService service;

    @BeforeEach
    void setup() {
        service = new ContactService();
    }

    @Test
    void testAddContactSuccess() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);

        Contact stored = service.getContact("1");
        assertNotNull(stored);
        assertEquals("John", stored.getFirstName());
    }

    @Test
    void testAddContactDuplicateId() {
        Contact c1 = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        Contact c2 = new Contact("1", "Mike", "Smith", "0987654321", "456 Park Ave");

        service.addContact(c1);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(c2));
    }

    @Test
    void testDeleteContactSuccess() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);

        service.deleteContact("1");
        assertNull(service.getContact("1"));
    }

    @Test
    void testDeleteContactNotFound() {
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("999"));
    }

    @Test
    void testUpdateFirstNameSuccess() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);

        service.updateFirstName("1", "Mike");
        assertEquals("Mike", service.getContact("1").getFirstName());
    }

    @Test
    void testUpdateLastNameSuccess() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);

        service.updateLastName("1", "Smith");
        assertEquals("Smith", service.getContact("1").getLastName());
    }

    @Test
    void testUpdatePhoneSuccess() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);

        service.updatePhone("1", "1112223333");
        assertEquals("1112223333", service.getContact("1").getPhone());
    }

    @Test
    void testUpdateAddressSuccess() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);

        service.updateAddress("1", "999 New Address Ave");
        assertEquals("999 New Address Ave", service.getContact("1").getAddress());
    }

    @Test
    void testUpdateNotFound() {
        assertThrows(IllegalArgumentException.class, () -> service.updateFirstName("999", "Mike"));
    }

    @Test
    void testUpdateInvalidValue() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);

        // invalid phone (not 10 digits)
        assertThrows(IllegalArgumentException.class, () -> service.updatePhone("1", "123"));
    }
}
