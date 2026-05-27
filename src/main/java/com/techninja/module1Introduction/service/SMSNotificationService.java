package com.techninja.module1Introduction.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service(value = "SMSNotif")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Sending....." +message);
    }

}
