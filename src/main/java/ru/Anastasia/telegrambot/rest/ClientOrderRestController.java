package ru.Anastasia.telegrambot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.Anastasia.telegrambot.entities.ClientOrder;
import ru.Anastasia.telegrambot.service.TelegramBotService;

import java.util.List;

@RestController
public class ClientOrderRestController {
    private final TelegramBotService telegramBotService;

    public ClientOrderRestController(TelegramBotService telegramBotService){
        this.telegramBotService =telegramBotService;
    }

    @GetMapping(value = "/rest/clients/{id}/orders")
    List<ClientOrder> getClientOrders(@PathVariable Long id){
       return telegramBotService.getClientOrders(id);
    }
}
