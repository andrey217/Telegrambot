package com.nikitin.TelegramBot.bots;

import com.nikitin.TelegramBot.annotations.TelegramBot;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

@TelegramBot
public class AndreyNikitinEchoBot extends TelegramLongPollingBot {

    private static final String BOT_USERNAME = "AndreyNikitinBot";
    private static final String ACCESS_TOKEN = "1153860112:AAHtFKwmfmvAuMlP2CuCaKB0V87kZVK17xg";

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage()
                    .setChatId(update.getMessage().getChatId())
                    .setText(getFormattedUpdateMessage(update));
            try {
                execute(message);
            } catch (TelegramApiException e) {
                System.out.println("Error: " + e);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return ACCESS_TOKEN;
    }
}
