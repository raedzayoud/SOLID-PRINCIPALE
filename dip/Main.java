public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.notifyUser("Hello by email");

        NotificationService smsService = new NotificationService(new SmsSender());
        smsService.notifyUser("Hello by SMS");

        FakeSender fake = new FakeSender();
        new NotificationService(fake).notifyUser("test");
        System.out.println("Fake received: " + fake.lastMessage);
    }
}
