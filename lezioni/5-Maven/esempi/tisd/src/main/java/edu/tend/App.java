package edu.tend;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import edu.tend.bot.TisdBot;
import edu.tend.handlers.CommandHandler;

public class App {
    public static void main(String[] args) {
        String botToken = System.getenv("BOT_TOKEN");
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new TisdBot(botToken));
            botsApi.registerBot(new CommandHandler(botToken));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
