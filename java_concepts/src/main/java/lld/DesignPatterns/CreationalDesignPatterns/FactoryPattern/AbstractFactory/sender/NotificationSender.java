package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.sender;

import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.NotificationType;
import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();
}
