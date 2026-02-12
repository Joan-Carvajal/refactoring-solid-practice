package exercise1_notifications.refactored.service;

import exercise1_notifications.refactored.NotificationResult;
import exercise1_notifications.refactored.factory.NotificationSenderFactory;
import exercise1_notifications.refactored.logs.NotificationLogger;

public class NotificationService {
    private final NotificationLogger notificationLogger;
    private final NotificationSenderFactory senderFactory;

    public NotificationService(NotificationSenderFactory senderFactory,NotificationLogger notificationLogger ) {
        this.notificationLogger = notificationLogger;
        this.senderFactory = senderFactory;
    }
    public NotificationResult sendNotification(String notificationType, String recipient,
                                               String message){
    return null;
    }
}
