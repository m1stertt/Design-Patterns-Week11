package dal;

import be.Message;

import java.util.List;

public interface IDalFacade {

    void setAccessType(IDAO daoType);

    void logMessage(Message message);

    List<Message> getAllMessages();
}
