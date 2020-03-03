package chat.client.controller;

import chat.client.service.MessageSenderFxUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ChatFormController {

    @FXML
    AnchorPane allChatRoomsAnchorPane;

    @FXML
    Button sendMessageButton;

    @FXML
    TextField sendMessageTextField;

    @FXML
    TextArea chatTextArea;

    @FXML
    private void onEnterChatField() {
        sendMessage();
    }

    @FXML
    private void sendMessage() {
        MessageSenderFxUtil.sendMessage(chatTextArea, sendMessageTextField.getText());
        MessageSenderFxUtil.clearChatField(sendMessageTextField);
    }

}