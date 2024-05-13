package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender;

import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.NotificationType;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;

public class PushNotificationSender extends NotificationSender {
    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
