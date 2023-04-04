package edu.tend.bot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TisdBotTest {

    @Mock
    TisdBot bot = Mockito.mock(TisdBot.class);

    @Test
    public void shouldReturnBotName() {
        Mockito.doCallRealMethod().when(bot).getBotUsername();
        String botName = bot.getBotUsername();
        assertEquals("tisd_bot", botName);
    }

    @Test
    public void shouldRespondToPing() throws TelegramApiException {
        Mockito.doCallRealMethod().when(bot).onUpdateReceived(Mockito.any(Update.class));
        Update update = Mockito.mock(Update.class);
        Message message = Mockito.mock(Message.class);
        Mockito.when(update.hasMessage()).thenReturn(true);
        Mockito.when(update.getMessage()).thenReturn(message);
        Mockito.when(message.hasText()).thenReturn(true);
        Mockito.when(message.getText()).thenReturn("ping");
        bot.onUpdateReceived(update);
        Mockito.verify(bot, Mockito.times(1)).execute(Mockito.any(SendMessage.class));
    }

    @Test
    public void shouldNotRespondToNotPing() throws TelegramApiException {
        Mockito.doCallRealMethod().when(bot).onUpdateReceived(Mockito.any(Update.class));
        Update update = Mockito.mock(Update.class);
        Message message = Mockito.mock(Message.class);
        Mockito.when(update.hasMessage()).thenReturn(true);
        Mockito.when(update.getMessage()).thenReturn(message);
        Mockito.when(message.hasText()).thenReturn(true);
        Mockito.when(message.getText()).thenReturn("not ping");
        bot.onUpdateReceived(update);
        Mockito.verify(bot, Mockito.never()).execute(Mockito.any(SendMessage.class));
    }
}
