package be;

public class Message {

    private String text;

    public Message(int id, String text) {
        this.text = text;
    }

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
