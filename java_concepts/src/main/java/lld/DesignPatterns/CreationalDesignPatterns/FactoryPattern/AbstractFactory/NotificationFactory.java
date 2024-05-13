package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender.NotificationSender;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract NotificationTemplate createTemplate(String message);

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);

    public abstract NotificationSender createNotificationSender(Notification notification);
}
