package gui.controller;

import be.Message;
import gui.model.MessageCreatorModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MessageCreatorController implements Initializable {

    @FXML
    private TextField logMessageTextfield;
    @FXML
    private ListView<Message> messageListView;
    @FXML
    private TextArea showMessageTextField;

    private MessageCreatorModel messageCreatorModel;

    private ObservableList<Message> messagesInList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        messageCreatorModel = new MessageCreatorModel();
        messagesInList.addAll(messageCreatorModel.getAllMessages());
        messageListView.setItems(messagesInList);
    }


    public void onLogMessage(ActionEvent actionEvent) {
    messagesInList.add(messageCreatorModel.logMessage(logMessageTextfield.getText()));
    }


    public void onSelectMessage(MouseEvent mouseEvent) {
        showMessageTextField.setText(messageListView.getSelectionModel().getSelectedItem().getText());
    }
}
