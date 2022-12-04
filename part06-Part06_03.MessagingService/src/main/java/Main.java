
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message newMessage = new Message("text for testing", "content");
       
        MessagingService msgServ = new MessagingService();
        msgServ.add(newMessage);
        System.out.println(msgServ.getMessages());
    }
}
