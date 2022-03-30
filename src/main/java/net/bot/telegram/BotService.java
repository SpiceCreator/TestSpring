package net.bot.telegram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
public class BotService {

  @Autowired
  private BotConfig botConfig;

  public BotService() {
//    BotConfig botConfig = new BotConfig();
    try {
      TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
      telegramBotsApi.registerBot(botConfig);
    } catch (TelegramApiException e) {
      e.printStackTrace();
    }
  }
}
