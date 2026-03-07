package com.kashi.Module1.Introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary    //for primary don't use qualifier
@Component
@Qualifier("smsNoti")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms sending.."+message);
    }
}
