package fabrics.messages;

import data.messages.*;

public class MessageFactory {
    public static Message createMessage(String type, String content) {
        if ("SIMPLE".equalsIgnoreCase(type)) {
            return new SimpleMessage(content);
        } else if ("URGENT".equalsIgnoreCase(type)) {
            return new UrgentMessage(content);
        }
        throw new IllegalArgumentException("Tipo de mensagem desconhecido: " + type);
    }
}