package ru.Anastasia.telegrambot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Anastasia.telegrambot.entities.ClientOrder;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "clientOrders",path = "clientOrders")
public interface ClientOrderRepository extends JpaRepository<ClientOrder,Long> {
    List<ClientOrder> findAllByClientId(Long id);
}