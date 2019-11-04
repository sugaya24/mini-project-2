import java.util.ArrayList;

public class ContactList {
    // instance fields
    ArrayList<Contact> contacts = new ArrayList<>() {};

    // constructor
    public ContactList(ArrayList contacts) {
        this.contacts = contacts;
    }

    public ArrayList getContacts() {
        return contacts;
    }

    public ContactList() {

    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    public void removeContact(int index) {
        contacts.remove(index);
    }
}
