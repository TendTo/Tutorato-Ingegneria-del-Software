package edu.tend.commands;

import java.util.Random;

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethodMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendDice;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;

public class DiceCommand extends BotCommand {

    public DiceCommand() {
        super("dice", "Throw a dice");
    }

    private SendDice getDice(Long chatId) {
        return SendDice.builder()
                .chatId(chatId.toString())
                .emoji("🎲")
                .build();
    }

    private SendMessage getDiceMessage(Long chatId, int maxThrow) {
        Random random = new Random();
        int dice = random.nextInt(0, maxThrow) + 1;
        return SendMessage.builder()
                .chatId(chatId.toString())
                .text("You rolled a " + dice)
                .build();
    }

    private SendMessage getErrorInvalidMaxThrow(Long chatId) {
        return SendMessage.builder()
                .chatId(chatId.toString())
                .text("Please enter a valid number > 0")
                .build();
    }

    private SendMessage handleMaxThrow(String arg, Chat chat) {
        try {
            int maxThrow = Integer.parseInt(arg);
            if (maxThrow > 1) {
                return getDiceMessage(chat.getId(), maxThrow);
            } else {
                return getErrorInvalidMaxThrow(chat.getId());
            }
        } catch (NumberFormatException e) {
            return getErrorInvalidMaxThrow(chat.getId());
        }
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        BotApiMethodMessage answer;
        if (arguments == null || arguments.length == 0) {
            answer = getDice(chat.getId());
        } else {
            answer = handleMaxThrow(arguments[0], chat);
        }

        try {
            absSender.execute(answer);
        } catch (Exception e) {
            System.err.println("Error while sending message to user: " + e.getMessage());
        }
    }

}
