package exercise1_notifications.refactored.logs;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotificationLogger {
    private final List<NotificationLogEntry> notificationLogs;

    public NotificationLogger() {
        this.notificationLogs = new ArrayList<>();
    }

    public void log(NotificationLogEntry logEntry){
        String log = String.format("[%s] %s - Type: %s, To: %s, Message: %s",
                logEntry.getDate(), logEntry.isStatus() ? "SUCCESS":"FAILED",
                logEntry.getNotificationType(), logEntry.getRecipient(), logEntry.getMessage());

        System.out.println(log);
        notificationLogs.add(logEntry);
    }
    public  List<NotificationLogEntry> getNotificationLogs(){
        return new ArrayList<>(notificationLogs);
    }
}
