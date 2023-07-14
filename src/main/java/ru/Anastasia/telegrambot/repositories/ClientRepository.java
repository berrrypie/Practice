package ru.Anastasia.telegrambot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Anastasia.telegrambot.entities.Category;
import ru.Anastasia.telegrambot.entities.Client;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "clients",path = "clients")
public interface ClientRepository extends JpaRepository<Client,Long> {
    List<Client> findDistinctClientByFullNameContaining(String name);
    Client findByFullName(String name);
}