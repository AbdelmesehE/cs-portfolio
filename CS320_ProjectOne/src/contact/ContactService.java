package contact;

import java.util.HashMap;

import java.util.Map;

public class ContactService {

    private final Map<String, Contact> contacts = new HashMap<>();

    // Add contact (ID must be unique)
    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("contact must not be null");
        }

        String id = contact.getContactId();

        if (contacts.containsKey(id)) {
            throw new IllegalArgumentException("contactId must be unique");
        }

        contacts.put(id, contact);
    }

    // Delete contact by ID
    public void deleteContact(String contactId) {
        if (contactId == null) {
            throw new IllegalArgumentException("contactId must not be null");
        }

        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("contactId not found");
        }

        contacts.remove(contactId);
    }

    // Update fields by ID
    public void updateFirstName(String contactId, String firstName) {
        Contact c = getExistingContact(contactId);
        c.setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        Contact c = getExistingContact(contactId);
        c.setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {
        Contact c = getExistingContact(contactId);
        c.setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {
        Contact c = getExistingContact(contactId);
        c.setAddress(address);
    }

    // Helper: get existing contact or throw
    private Contact getExistingContact(String contactId) {
        if (contactId == null) {
            throw new IllegalArgumentException("contactId must not be null");
        }

        Contact c = contacts.get(contactId);

        if (c == null) {
            throw new IllegalArgumentException("contactId not found");
        }

        return c;
    }

    // Helpful for testing (optional)
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
