package lld.DesignPatterns.FactoryPattern.AbstractFactory;

import lld.DesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;
import lld.DesignPatterns.FactoryPattern.AbstractFactory.sender.NotificationSender;
import lld.DesignPatterns.FactoryPattern.AbstractFactory.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract NotificationTemplate createTemplate(String message);

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);

    public abstract NotificationSender createNotificationSender(Notification notification);
}
