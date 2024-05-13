package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.SimpleFactory;

public abstract class Notification {
    private String recipient;
    private String message;

    public abstract NotificationType notificationType();

    public abstract void sendNotification();

    public abstract String getMessage();

    public abstract String getRecipient();
}
