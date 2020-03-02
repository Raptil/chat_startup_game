package chat.client.controller;

import chat.client.App;
import chat.client.service.MessageSenderFx;
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
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void onEnterChatField() {
        sendMessage();
    }

    @FXML
    private void sendMessage() {
        MessageSenderFx.sendMessage(chatArea, chatField.getText());
        MessageSenderFx.clearChatField(chatField);
    }
}
