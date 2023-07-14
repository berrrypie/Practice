package ru.Anastasia.telegrambot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.Anastasia.telegrambot.entities.Product;
import ru.Anastasia.telegrambot.service.TelegramBotService;

import java.util.List;

@RestController
public class ProductRestController {
    private final TelegramBotService telegramBotService;

    public ProductRestController(TelegramBotService telegramBotService){
        this.telegramBotService =telegramBotService;
    }

    @GetMapping(value="/rest/products/search?categoryId=")
    public List<Product> getProductsByCategoryId(@RequestParam Long id){
        return telegramBotService.getProductsByCategoryId(id);
    }

    @GetMapping(value="/rest/clients/{id}/products")
    public List<Product> getClientProducts(@PathVariable Long id){
        return telegramBotService.getProductsByCategoryId(id);
    }

    @GetMapping(value="/rest/products/popular?limit=")
    public List<Product> getTopPopularProducts(@RequestParam Integer limit){
        return telegramBotService.getTopPopularProducts(limit);
    }

    @GetMapping(value = "/rest/products/search?name= ")
    List<Product> searchProductsByName(@RequestParam String name){
        return telegramBotService.searchProductsByName(name);
    }

}
