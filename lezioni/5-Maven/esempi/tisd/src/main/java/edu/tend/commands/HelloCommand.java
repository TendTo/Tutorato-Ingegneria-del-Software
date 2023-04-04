package edu.tend.commands;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class HelloCommand extends BotCommand {

    public HelloCommand() {
        super("hello", "Say hello to the bot");
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] args) {
        String userName = chat.getUserName();
        if (userName == null || userName.isEmpty()) {
            userName = user.getFirstName() + " " + user.getLastName();
        }

        StringBuilder messageTextBuilder = new StringBuilder("Hello ").append(userName);
        if (args != null && args.length > 0) {
            messageTextBuilder.append("\n");
            messageTextBuilder.append("Thank you so much for your kind words:\n");
            messageTextBuilder.append(String.join(" ", args));
        }

        SendMessage answer = SendMessage.builder()
                .chatId(chat.getId().toString())
                .text(messageTextBuilder.toString())
                .build();
        try {
            absSender.execute(answer);
        } catch (TelegramApiException e) {
            System.err.println("Error while sending message to user: " + e.getMessage());
        }
    }

}
