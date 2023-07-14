package ru.Anastasia.telegrambot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.Anastasia.telegrambot.entities.Client;
import ru.Anastasia.telegrambot.entities.ClientOrder;
import ru.Anastasia.telegrambot.entities.Product;
import ru.Anastasia.telegrambot.repositories.*;

import java.awt.print.Pageable;
import java.util.List;
@Service
@Transactional
public class TelegramBotService implements EntitiesService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientOrderRepository clientOrderRepository;


    @Override
    public List<Product> getProductsByCategoryId(Long id){

        return productRepository.findByCategoryId(id);
    }

    @Override
    public List<ClientOrder> getClientOrders(Long id){

        return clientOrderRepository.findAllByClientId(id);
    }

    @Override
    public List<Product> getClientProducts(Long id){

    productRepository.getClientProducts(id);
        return productRepository.getClientProducts(id);
    }

    @Override
    public List<Product> getTopPopularProducts(Integer limit){

        Pageable PageWithOneElement = (Pageable) PageRequest.of(0,limit);
        return productRepository.getTopPopularProducts(PageWithOneElement);
    }

    @Override
    public List<Client> searchClientsByName(String name){

        return clientRepository.findDistinctClientByFullNameContaining(name);
    }
    @Override
    public List<Product> searchProductsByName(String name){

        return productRepository.findDistinctProductByNameContaining(name);
    }

}
