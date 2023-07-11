package ru.Anastasia.telegrambot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Anastasia.telegrambot.entities.Category;


@RepositoryRestResource (collectionResourceRel = "categories", path = "categories")
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
}
