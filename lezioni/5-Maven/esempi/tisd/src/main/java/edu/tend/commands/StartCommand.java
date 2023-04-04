package edu.tend.commands;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;

public class StartCommand extends BotCommand {

    public StartCommand() {
        super("start", "start command");
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        String username = chat.getUserName() == null ? chat.getUserName() : user.getFirstName();
        SendMessage answer = SendMessage.builder()
                .chatId(chat.getId().toString())
                .text("Hello, " + username + "!")
                .build();

        try {
            absSender.execute(answer);
        } catch (Exception e) {
            System.err.println("Error while sending message to user: " + e.getMessage());
        }
    }

}
