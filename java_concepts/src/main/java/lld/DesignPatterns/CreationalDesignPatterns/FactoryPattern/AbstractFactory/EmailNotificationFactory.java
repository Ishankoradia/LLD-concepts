package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.EmailNotification;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender.EmailNotificationSender;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender.NotificationSender;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.template.EmailNotificationTemplate;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    public NotificationTemplate createTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }

    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient, sender, template);
    }

    public NotificationSender createNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }
}
