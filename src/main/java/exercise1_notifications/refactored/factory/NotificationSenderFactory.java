package exercise1_notifications.refactored.factory;

import exercise1_notifications.refactored.EmailNotificationSender;
import exercise1_notifications.refactored.NotificationSender;
import exercise1_notifications.refactored.PushNotificationSender;
import exercise1_notifications.refactored.SmsNotificationSender;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationSenderFactory {
    private final Map<String, Supplier<NotificationSender>> registers;

    public NotificationSenderFactory() {
        this.registers = new HashMap<>();
        registers.put("EMAIL", EmailNotificationSender::new);
        registers.put("SMS", SmsNotificationSender::new);
        registers.put("PUSH", PushNotificationSender::new);


    }

    public NotificationSender createSender(String type) {
        Supplier<NotificationSender> supplier = registers.get(type.toUpperCase());
        if (supplier == null) throw new IllegalArgumentException("Unknown notification type");
        NotificationSender sender = supplier.get();
        if (sender== null) throw new IllegalArgumentException("Unknown with supplier");
        return sender;
    }

    public void registerSender(String type, Supplier<NotificationSender> supplier) {
        this.registers.put(type.toUpperCase(), supplier);
    }

}
