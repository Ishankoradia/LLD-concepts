package lld.DesignPatterns.FactoryPattern.AbstractFactory;

import lld.DesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;
import lld.DesignPatterns.FactoryPattern.AbstractFactory.notification.PushNotification;
import lld.DesignPatterns.FactoryPattern.AbstractFactory.sender.NotificationSender;
import lld.DesignPatterns.FactoryPattern.AbstractFactory.sender.PushNotificationSender;
import lld.DesignPatterns.FactoryPattern.AbstractFactory.template.NotificationTemplate;
import lld.DesignPatterns.FactoryPattern.AbstractFactory.template.PushNotificationTemplate;

public class PushNotificationFactory {
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    public NotificationTemplate createTemplate(String message) {
        return new PushNotificationTemplate(message);
    }

    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }

    public NotificationSender createNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }
}
