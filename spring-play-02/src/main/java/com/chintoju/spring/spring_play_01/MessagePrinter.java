package com.chintoju.spring.spring_play_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kchintoju on 6/07/2016.
 */
@Component
public class MessagePrinter {

    final private MessageService messageService;

    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessageService getMessageService() {
        return messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }

}
