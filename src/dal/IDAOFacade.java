package dal;

import be.Message;

import java.util.List;

public interface IDAOFacade {

    List<Message> getAllMessages();

    void logMessage(Message message);

}
