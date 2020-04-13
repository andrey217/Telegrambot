package com.nikitin.TelegramBot.config;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;

import javax.annotation.PostConstruct;

@Component
public class TelegramApiContextInitializer {

    @PostConstruct
    private void initApiContextInitializer() {
        ApiContextInitializer.init();
    }
}
