package dal.xmldao;

import be.Message;
import dal.IDAOFacade;

import java.util.List;

public class XMLDAO implements IDAOFacade {

    private static XMLDAO xmldao = new XMLDAO();

    public static XMLDAO getInstance(){
        return xmldao;
    }

    private XMLDAO() {
    }

    @Override
    public List<Message> getAllMessages() {
        return null;
    }

    @Override
    public void logMessage(Message message) {

    }
}
