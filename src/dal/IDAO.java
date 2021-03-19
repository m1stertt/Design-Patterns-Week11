package dal;

import be.Message;

import java.util.List;

public interface IDAO {

    List<Message> getAllMessages();

    void logMessage(Message message);

}
