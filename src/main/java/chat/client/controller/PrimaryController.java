package chat.client.controller;

import chat.client.App;
import chat.client.service.MessageSenderFxUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PrimaryController {

    @FXML
    private TextArea chatArea;

    @FXML
    private TextField chatField;

    @FXML
    private Button send;

    @FXML
    private void switchToChatForm() throws IOException {
        App.setRoot("chat-form");
    }

    @FXML
    private void onEnterChatField() {
        sendMessage();
    }

    @FXML
    private void sendMessage() {
        MessageSenderFxUtil.sendMessage(chatArea, chatField.getText());
        MessageSenderFxUtil.clearChatField(chatField);
    }
}
