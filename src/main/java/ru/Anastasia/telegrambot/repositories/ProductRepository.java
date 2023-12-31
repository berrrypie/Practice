package ru.Anastasia.telegrambot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Anastasia.telegrambot.entities.Product;

@RepositoryRestResource(collectionResourceRel = "products",path = "products")
public interface ProductRepository extends JpaRepository<Product,Long> {
}