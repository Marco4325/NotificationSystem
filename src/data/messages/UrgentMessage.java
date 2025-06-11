package data.messages;

public class UrgentMessage extends Message {

    public UrgentMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return String.format("\u001B[31m[Urgente]\n\u001B[39;49m%s", content);
    }
}