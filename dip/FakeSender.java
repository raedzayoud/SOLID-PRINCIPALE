public class FakeSender implements MessageSender {
    public String lastMessage;

    @Override
    public void send(String message) {
        lastMessage = message;
    }
}
