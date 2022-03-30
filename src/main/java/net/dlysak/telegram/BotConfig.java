package net.dlysak.telegram;

import net.dlysak.telegram.commands.StartCommand;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class BotConfig extends TelegramLongPollingCommandBot {

  public BotConfig() {
    register(new StartCommand());
  }

  @Override
  public String getBotUsername() {
    return BotConstants.botName;
  }

  @Override
  public String getBotToken() {
    return BotConstants.botToken;
  }

  @Override
  public void processNonCommandUpdate(Update update) {}
}
