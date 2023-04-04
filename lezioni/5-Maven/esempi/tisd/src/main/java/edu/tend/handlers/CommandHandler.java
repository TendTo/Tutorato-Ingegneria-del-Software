package edu.tend.handlers;

import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import edu.tend.commands.DiceCommand;
import edu.tend.commands.HelloCommand;
import edu.tend.commands.StartCommand;

public class CommandHandler extends TelegramLongPollingCommandBot {

    public static final String LOGTAG = "COMMANDSHANDLER";
    public static final String BOT_NAME = "tisd_bot";

    private String token;

    public CommandHandler(String token) {
        this.token = token;
        register(new StartCommand());
        register(new HelloCommand());
        register(new DiceCommand());
    }

    @Override
    public void processNonCommandUpdate(Update update) {
    }

    @Override
    public String getBotUsername() {
        return CommandHandler.BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return token;
    }
}