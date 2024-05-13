package lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.template;

import lld.DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.NotificationType;

public class PushNotificationTemplate extends NotificationTemplate {
    public PushNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Push notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
