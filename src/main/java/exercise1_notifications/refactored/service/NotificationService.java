package exercise1_notifications.refactored.service;

import exercise1_notifications.refactored.NotificationResult;
import exercise1_notifications.refactored.NotificationSender;
import exercise1_notifications.refactored.factory.NotificationSenderFactory;
import exercise1_notifications.refactored.logs.NotificationLogEntry;
import exercise1_notifications.refactored.logs.NotificationLogger;

public class NotificationService {
    private final NotificationLogger notificationLogger;
    private final NotificationSenderFactory senderFactory;

    public NotificationService(NotificationSenderFactory senderFactory, NotificationLogger notificationLogger) {
        this.notificationLogger = notificationLogger;
        this.senderFactory = senderFactory;
    }

    public NotificationResult sendNotification(String notificationType, String recipient,
                                               String message) {
        NotificationResult result =null;
        try {
            NotificationSender sender = senderFactory.createSender(notificationType);
             result =sender.send(recipient,message);

            notificationLogger.log(new NotificationLogEntry(result.isSuccess(),notificationType
            , recipient, message));
            return result;
        } catch (Exception e) {
            notificationLogger.log(new NotificationLogEntry(false,
                    notificationType, recipient, message));
            result= NotificationResult.failure("unknown");
        }
        return result;

    }
}
