package data.messages;

public abstract class Message {
    protected String content;

    public Message(String content) {
        this.content = content;
    }

    public abstract String format(); // Método para formatar a mensagem específica

    public String getContent() {
        return content;
    }
}