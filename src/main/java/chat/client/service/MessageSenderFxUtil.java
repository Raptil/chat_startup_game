package chat.client.service;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Отправка сообщений на форме чата.
 */
public final class MessageSenderFxUtil {

    private MessageSenderFxUtil() {
    }

    public static void sendMessage(TextArea textArea, String message) {
        if (!message.isEmpty()) {
            textArea.appendText(message);
            appendLineSeparator(textArea);
        }
    }

    private static void appendLineSeparator(TextArea textArea) {
        textArea.appendText(System.lineSeparator());
    }

    public static void clearChatField(TextField chatField) {
        chatField.clear();
    }
}
