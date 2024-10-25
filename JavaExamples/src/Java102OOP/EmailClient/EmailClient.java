package Java102OOP.EmailClient;

import java.util.ArrayList;

public class EmailClient {
    private final ArrayList<Email> inbox;

    public EmailClient() {
        inbox = new ArrayList<>();
    }

    public void sendEmail(Email email) {
        System.out.println("Sending email...");
        System.out.println("To: " + email.getReceiver());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Body: " + email.getBody());
        System.out.println("Email sent successfully!");
    }

    public void receiveEmail(Email email) {
        System.out.println("New email received!");
        System.out.println("From: " + email.getSender());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Body: " + email.getBody());
        inbox.add(email);
    }

    public void listEmails() {
        System.out.println("Listing emails in inbox:");
        for (Email email : inbox) {
            System.out.println("From: " + email.getSender() + ", Subject: " + email.getSubject());
        }
    }
}
