package net.dlysak;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
    String[] beans = context.getBeanDefinitionNames();
    List<String> list = Arrays.stream(beans).sorted().collect(Collectors.toList());
    for (String s : list) {
      System.out.println("bean = " + s);
    }
  }
}
