import data.messages.Message;
import fabrics.messages.MessageFactory;
import services.notifications.NotificationService;
import strategies.notification.concretes.*;

public class Main {

    public static void main(String[] args) {
        Message welcomeMessage = MessageFactory.createMessage("SIMPLE", "Bem-vindo(a) ao nosso sistema!");
        Message alertMessage = MessageFactory.createMessage("URGENT", "Falha crítica detectada no servidor XYZ. Ação imediata requerida.");
        Message discountMessage = MessageFactory.createMessage("PROMOTIONAL", "50% DE DESCONTO EM MATERIAIS ESCOLARES! SOMENTE ATÉ DIA DD/MM!");

        NotificationService notificationService = new NotificationService();

        System.out.println("--- Usando Estratégia de Email ---");
        notificationService.setStrategy(new EmailNotificationStrategy());
        notificationService.sendNotification(welcomeMessage, "aluno@exemplo.com");
        notificationService.sendNotification(alertMessage, "admin@exemplo.com");
        notificationService.sendNotification(discountMessage, "alguminfeliz@exemplo.com");

        System.out.println("--- Mudando para Estratégia de SMS ---");
        notificationService.setStrategy(new SMSNotificationStrategy());
        notificationService.sendNotification(welcomeMessage, "+5511912345678");
        notificationService.sendNotification(alertMessage, "+5521987654321");
        notificationService.sendNotification(discountMessage, "+5531924680246");

    }
}