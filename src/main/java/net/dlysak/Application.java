package net.dlysak;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import net.dlysak.telegram.BotService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
  }
}
