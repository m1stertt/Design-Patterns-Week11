package bll;

import be.Message;

public class MessageCreator {

    public MessageCreator() {
    }

    public Message createMessage(String text){
        return new Message(text);
    }


}
