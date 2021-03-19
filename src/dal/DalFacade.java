package dal;

import be.Message;
import dal.dbdao.DBDAO;

import java.util.List;

public class DalFacade implements IDalFacade {

    private static DalFacade dalFacadeInstance = new DalFacade();
    private IDAO daoType = new DBDAO();

    public static DalFacade getInstance(){
        return dalFacadeInstance;
    }

    private DalFacade(){};


    @Override
    public void setAccessType(IDAO daoType) {
        this.daoType = daoType;
    }

    @Override
    public void logMessage(Message message) {
        daoType.logMessage(message);
    }

    @Override
    public List<Message> getAllMessages() {
        return daoType.getAllMessages();
    }


}
