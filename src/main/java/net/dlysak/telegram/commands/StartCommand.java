package net.dlysak.telegram.commands;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.bots.AbsSender;

@Component
public class StartCommand extends BotCommand {

  public StartCommand() {
    super("start", "Register Command");
  }

  @SneakyThrows
  @Override
  public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
    KeyboardButton news = KeyboardButton.builder().text("News").build();
    KeyboardButton rates = KeyboardButton.builder().text("Rates").build();
    KeyboardButton weather = KeyboardButton.builder().text("Weather").build();

    KeyboardRow newsRow = new KeyboardRow();
    newsRow.add(news);
    KeyboardRow ratesRow = new KeyboardRow();
    ratesRow.add(rates);
    KeyboardRow weatherRow = new KeyboardRow();
    weatherRow.add(weather);

    ReplyKeyboardMarkup.ReplyKeyboardMarkupBuilder mainKeyboard = ReplyKeyboardMarkup.builder().keyboardRow(newsRow).keyboardRow(ratesRow).keyboardRow(weatherRow);

    SendMessage message = new SendMessage();
    message.setReplyMarkup(mainKeyboard.build());
    message.setChatId(chat.getId().toString());
    message.setText("Welcome to Bro_Bot");
    absSender.execute(message);
  }
}
