public class NotificationService {
    private EmailSender sender = new EmailSender();   // tight coupling

    public void notifyUser(String message) {
        sender.send(message);
    }
}
