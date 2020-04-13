package com.nikitin.TelegramBot.annotations;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Component
@DependsOn("telegramApiContextInitializer")
@Retention(RetentionPolicy.RUNTIME)
public @interface TelegramBot {
}
