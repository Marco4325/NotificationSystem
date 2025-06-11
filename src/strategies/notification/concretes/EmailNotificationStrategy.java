// Estratégia de Notificação Concreta
package strategies.notification.concretes;

import data.messages.Message;
import strategies.notification.NotificationStrategy;

public class EmailNotificationStrategy implements NotificationStrategy {

    @Override
    public void send(Message message, String recipient) {
        System.out.println(message.format());
        System.out.println("Email destinatário: " + recipient + "\n");
    }
}