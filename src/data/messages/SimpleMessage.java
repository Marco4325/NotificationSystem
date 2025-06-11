package data.messages;

public class SimpleMessage extends Message {

    public SimpleMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return String.format("\n\u001B[33m[Nova Mensagem]\n\u001B[39;49m%s", content);
    }
}