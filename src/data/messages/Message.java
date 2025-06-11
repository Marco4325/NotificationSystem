package data.messages;

public abstract class Message {
    protected String content;

    public Message(String content) {
        this.content = content;
    }

    public abstract String format();
}