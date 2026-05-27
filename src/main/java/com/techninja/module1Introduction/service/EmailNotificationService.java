package com.techninja.module1Introduction.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service(value = "EmailNotif")
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
//@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Sending...." +message);
    }
}
