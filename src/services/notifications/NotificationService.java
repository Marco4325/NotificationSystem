package services.notifications;

import data.messages.Message;
import strategies.notification.NotificationStrategy;

public class NotificationService {
    private NotificationStrategy strategy;

    public NotificationService() {}

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendNotification(Message message, String recipient) {
        if (strategy == null) {
            System.out.println("Erro: Nenhuma estratégia de notificação foi definida.\n");
            return;
        }
        if (message == null) {
            System.out.println("Erro: Mensagem não pode ser nula.\n");
            return;
        }
        strategy.send(message, recipient);
    }
}