package Java102OOP.EmailClient;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EmailClient client = new EmailClient();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Send Email");
            System.out.println("2. Receive Email");
            System.out.println("3. List Inbox");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("To: ");
                    String receiver = scanner.nextLine();
                    System.out.print("Subject: ");
                    String subject = scanner.nextLine();
                    System.out.print("Body: ");
                    String body = scanner.nextLine();
                    Email emailToSend = new Email("youremail@example.com", receiver, subject, body);
                    client.sendEmail(emailToSend);
                    break;
                case 2:
                    // Simulate receiving an email
                    Email receivedEmail = new Email("sender@example.com", "youremail@example.com", "Test Subject", "Test Body");
                    client.receiveEmail(receivedEmail);
                    break;
                case 3:
                    client.listEmails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}