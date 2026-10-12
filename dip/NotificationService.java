public class NotificationService {
    private final MessageSender sender;

    public NotificationService(MessageSender sender) {   // injected
        this.sender = sender;
    }

    public void notifyUser(String message) {
        sender.send(message);
    }
}
