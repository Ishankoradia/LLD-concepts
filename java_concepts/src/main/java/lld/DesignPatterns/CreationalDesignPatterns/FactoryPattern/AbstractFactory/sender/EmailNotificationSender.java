package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender;

import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.NotificationType;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;

public class EmailNotificationSender extends NotificationSender {
    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
