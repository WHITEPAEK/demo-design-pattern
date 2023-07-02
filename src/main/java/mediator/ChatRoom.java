package mediator;

import java.util.ArrayList;
import java.util.List;

// ConcreteMediator
public class ChatRoom implements ChatMediator {

    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void adduser(User user) {
        users.add(user);
    }
}
