package contact;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testContactCreationSuccess() {
        Contact c = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");
        assertEquals("12345", c.getContactId());
        assertEquals("John", c.getFirstName());
        assertEquals("Doe", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Main Street", c.getAddress());
    }

    // contactId tests
    @Test
    void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact(null, "John", "Doe", "1234567890", "123 Main Street")
        );
    }

    @Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main Street")
        );
    }

    // firstName tests
    @Test
    void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", null, "Doe", "1234567890", "123 Main Street")
        );
    }

    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "ABCDEFGHIJK", "Doe", "1234567890", "123 Main Street")
        );
    }

    // lastName tests
    @Test
    void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", null, "1234567890", "123 Main Street")
        );
    }

    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "ABCDEFGHIJK", "1234567890", "123 Main Street")
        );
    }

    // phone tests
    @Test
    void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", null, "123 Main Street")
        );
    }

    @Test
    void testPhoneNot10Digits() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "12345", "123 Main Street")
        );
    }

    @Test
    void testPhoneContainsLetters() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "12345abcde", "123 Main Street")
        );
    }

    // address tests
    @Test
    void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "1234567890", null)
        );
    }

    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "1234567890", "1234567890123456789012345678901")
        );
    }

    // Update field tests (contactId not updatable by design)
    @Test
    void testUpdateFirstNameValid() {
        Contact c = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");
        c.setFirstName("Mike");
        assertEquals("Mike", c.getFirstName());
    }

    @Test
    void testUpdatePhoneInvalid() {
        Contact c = new Contact("12345", "John", "Doe", "1234567890", "123 Main Street");
        assertThrows(IllegalArgumentException.class, () -> c.setPhone("111"));
    }
}
