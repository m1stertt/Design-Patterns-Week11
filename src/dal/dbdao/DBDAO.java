package dal.dbdao;

import be.Message;
import dal.IDAO;
import javafx.collections.FXCollections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DBDAO implements IDAO {

    private DBConnector dataSource = new DBConnector();

    public void logMessage(Message message) {
        try (Connection con = dataSource.getConnection()) {

            String sql = "INSERT INTO Message (Text) VALUES (?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,message.getText());
            pstmt.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Message> getAllMessages(){
        List<Message> allMessages = FXCollections.observableArrayList();
        try (Connection con = dataSource.getConnection()){
            String sql = "SELECT * FROM Message";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String text = rs.getString("text");

                Message msg = new Message(id, text);
                allMessages.add(msg);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allMessages;
    }
}
