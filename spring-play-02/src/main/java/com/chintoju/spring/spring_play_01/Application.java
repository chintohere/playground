package com.chintoju.spring.spring_play_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kchintoju on 6/07/2016.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean MessageService getMessageService() {
        return new MessageService() {
            @Override public String getMessage() {
                return "Hello World";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
    }
}
