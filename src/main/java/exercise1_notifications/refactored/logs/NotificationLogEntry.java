package exercise1_notifications.refactored.logs;

import java.time.LocalDateTime;

public class NotificationLogEntry {
    private final LocalDateTime date;

    private final boolean status;
    private final String notificationType;
    private final String recipient;
    private final String message;

    public NotificationLogEntry(boolean status, String notificationType, String recipient, String message) {
        this.date = LocalDateTime.now();
        this.status = status;
        this.notificationType = notificationType;
        this.recipient = recipient;
        this.message = message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public boolean isStatus() {
        return status;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
}
