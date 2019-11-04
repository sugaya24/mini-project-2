import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Yuki", "111-2222-3333");
        Contact contact2 = new Contact("Derrick", "222-2222-3333");
        Contact contact3 = new Contact("Steve", "333-2222-3333");

        ContactList contacts = new ContactList();
        contacts.addContact(contact1);
        contacts.addContact(contact2);
        contacts.addContact(contact3);

        while(true) {
            Scanner in = new Scanner(System.in);
            String prompt = in.nextLine();
            String usernameInput = InputCollector.getUserInput(prompt);
            if (usernameInput.equals("quit")) {
                System.exit(0);
            } else {
                System.out.println(usernameInput);
            }
        }

    }
}
