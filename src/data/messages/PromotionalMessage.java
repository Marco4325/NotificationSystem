package data.messages;

public class PromotionalMessage extends Message{

    public PromotionalMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return String.format("\u001B[95m[Mensagem Promocional]\u001B[39;49m\n%s", content);
    }
}
