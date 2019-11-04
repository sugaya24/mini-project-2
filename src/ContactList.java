import java.util.ArrayList;

public class ContactList {
    // instance fields
    private ArrayList contacts;

    // constructor
    public ContactList(ArrayList contacts) {
        this.contacts = contacts;
    }

    public ContactList() {

    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }
}
