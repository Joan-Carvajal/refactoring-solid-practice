package exercise1_notifications.refactored;

public class NotificationResult {

    private final boolean success;
    private  final String message;

    public NotificationResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    public static NotificationResult success(String message){
    return  new NotificationResult(true,message);
    }
    public static NotificationResult failure(String message){
        return  new NotificationResult(false,message);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
