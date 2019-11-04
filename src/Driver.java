import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
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
