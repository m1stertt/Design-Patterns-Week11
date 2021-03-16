package bll;

import be.Message;

import java.util.List;

public interface IMessageLoggerFacade {


    Message logMessage(String text);


    List<Message> getAllMessages();
}
