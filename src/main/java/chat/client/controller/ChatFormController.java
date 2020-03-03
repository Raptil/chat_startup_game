package chat.client.controller;

import chat.client.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class ChatFormController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}