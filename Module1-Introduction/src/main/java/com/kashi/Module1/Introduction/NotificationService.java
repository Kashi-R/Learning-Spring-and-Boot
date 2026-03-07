package com.kashi.Module1.Introduction;

import org.springframework.stereotype.Component;

@Component
public interface NotificationService {

    public void send(String message);
}
