package mediator;

// ConcreteColleague
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + "이(가) 메시지를 보냅니다: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + "이(가) 메시지를 받았습니다: " + message);
    }
}
