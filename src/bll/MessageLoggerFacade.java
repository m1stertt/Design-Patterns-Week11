package bll;

import be.Message;
import dal.dbdao.DBDAO;
import dal.xmldao.XMLDAO;

import java.util.List;

public class MessageLoggerFacade implements IMessageLoggerFacade {

    private static MessageLoggerFacade messageLoggerFacadeInstance = new MessageLoggerFacade();

    private DBDAO DBDAO = dal.dbdao.DBDAO.getInstance();
//    private XMLDAO xmldao = dal.xmldao.XMLDAO.getInstance();
    private MessageCreator messageCreator = new MessageCreator();

    public static MessageLoggerFacade getInstance(){
        return messageLoggerFacadeInstance;
    }

    private MessageLoggerFacade() {
    }

    @Override
    public Message logMessage(String text) {
        DBDAO.logMessage(messageCreator.createMessage(text));
        return messageCreator.createMessage(text);
    }

    @Override
    public List<Message> getAllMessages() {
        return DBDAO.getAllMessages();
    }


}
