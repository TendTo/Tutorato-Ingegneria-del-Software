package edu.tend.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage.SendMessageBuilder;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TisdBot extends TelegramLongPollingBot {
    public TisdBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            if (messageText.equals("ping")) {
                SendMessageBuilder messageBuilder = SendMessage.builder()
                        .chatId(update.getMessage().getChatId().toString())
                        .text("pong")
                        .replyToMessageId(update.getMessage().getMessageId());
                try {
                    execute(messageBuilder.build());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "tisd_bot";
    }
}
