package strategies.notification;

import data.messages.Message;

public interface NotificationStrategy {
    void send(Message message, String recipient);
}