package fxcompany;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    private void sendMessage() throws IOException{
        chatArea.appendText(chatField.getText());
    }
}
