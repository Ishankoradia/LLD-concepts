package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.PushNotification;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender.NotificationSender;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender.PushNotificationSender;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.template.NotificationTemplate;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.template.PushNotificationTemplate;

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
