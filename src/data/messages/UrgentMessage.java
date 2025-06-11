package data.messages;

public class UrgentMessage extends Message {

    public UrgentMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return "";
    }
}