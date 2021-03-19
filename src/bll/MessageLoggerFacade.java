package bll;

import be.Message;
import dal.DalFacade;
import dal.IDalFacade;
import dal.dbdao.DBDAO;
import dal.xmldao.XMLDAO;

import java.util.List;

public class MessageLoggerFacade implements IMessageLoggerFacade {

    private static MessageLoggerFacade messageLoggerFacadeInstance = new MessageLoggerFacade();

    private DalFacade dalFacade = DalFacade.getInstance();
    private MessageCreator messageCreator = new MessageCreator();

    public static MessageLoggerFacade getInstance(){
        return messageLoggerFacadeInstance;
    }

    private MessageLoggerFacade() {
    }

    @Override
    public Message logMessage(String text) {
        Message message = messageCreator.createMessage(text);
        dalFacade.logMessage(message);
        return message;
    }

    @Override
    public List<Message> getAllMessages() {
        return dalFacade.getAllMessages();
    }


}
