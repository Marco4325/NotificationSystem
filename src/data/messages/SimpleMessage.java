package data.messages;

public class SimpleMessage extends Message {

    public SimpleMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return "";
    }
}