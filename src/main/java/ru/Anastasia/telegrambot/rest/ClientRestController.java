package ru.Anastasia.telegrambot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.Anastasia.telegrambot.entities.Client;
import ru.Anastasia.telegrambot.service.TelegramBotService;

import java.util.List;

@RestController
public class ClientRestController {
    private final TelegramBotService telegramBotService;

    public ClientRestController(TelegramBotService telegramBotService){
        this.telegramBotService =telegramBotService;
    }

    @GetMapping(value = "/rest/clients/search?name=")
    public List<Client> searchClientsByName(@RequestParam String name){
        return telegramBotService.searchClientsByName(name);
    }
}
