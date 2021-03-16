package gui.model;

import be.Message;
import bll.MessageLoggerFacade;

import java.util.List;

public class MessageCreatorModel {

    private MessageLoggerFacade messageLoggerFacade = bll.MessageLoggerFacade.getInstance();

    public Message logMessage(String text) {
        return messageLoggerFacade.logMessage(text);
    }

    public List<Message> getAllMessages() {
        return messageLoggerFacade.getAllMessages();
    }
}
